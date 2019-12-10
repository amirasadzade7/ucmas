package ir.ateam.ucmas;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import ir.ateam.ucmas.Retrofit.INodeJS;
import ir.ateam.ucmas.Retrofit.RetrofitClient;
import retrofit2.Retrofit;

public class SigninActivity extends AppCompatActivity {

    INodeJS myAPI;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Retrofit retrofit = RetrofitClient.getInstance();
        myAPI = retrofit.create(INodeJS.class);

        Typeface nazanin = Typeface.createFromAsset(getAssets(), "fonts/nazanin.ttf");
        Button btnLogin = findViewById(R.id.btnLogin);
        TextView btnSignup = findViewById(R.id.btnSignup);
        TextView txtSignup = findViewById(R.id.txtSignup);
        TextView txtForget = findViewById(R.id.txtForget);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPass = findViewById(R.id.etPass);
        TextView txtTitle = findViewById(R.id.txtTitle);

        btnLogin.setTypeface(nazanin);
        btnSignup.setTypeface(nazanin);
        txtSignup.setTypeface(nazanin);
        txtForget.setTypeface(nazanin);
        etEmail.setTypeface(nazanin);
        etPass.setTypeface(nazanin);
        txtTitle.setTypeface(nazanin);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SigninActivity.this, SignupActivity.class));
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etEmail.getText().toString().equals("")) {
                    Toast.makeText(SigninActivity.this, "پست الکترونیکی خود را وارد کنید", Toast.LENGTH_LONG).show();
                } else if (!isEmailValid(etEmail.getText().toString())) {
                    Toast.makeText(SigninActivity.this, "پست الکترونیکی را درست وارد کنید", Toast.LENGTH_LONG).show();
                } else if (etPass.getText().toString().equals("")) {
                    Toast.makeText(SigninActivity.this, "رمز عبور را وارد کنید", Toast.LENGTH_LONG).show();
                } else {
                    try {
                        compositeDisposable.add(myAPI.loginUser(etEmail.getText().toString(), etPass.getText().toString())
                                .subscribeOn(Schedulers.io())
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Consumer<String>() {
                                    @Override
                                    public void accept(String s) throws Exception {
                                        startActivity(new Intent(SigninActivity.this, LevelActivity.class));
                                        Toast.makeText(SigninActivity.this, "" + s, Toast.LENGTH_LONG).show();
                                    }
                                })
                        );
                    } catch (Exception e) {
                        Toast.makeText(SigninActivity.this, "متاسفانه مشکلی در اتصال به سرور به وجود آمده", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    public static boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isUsernameValid(String email) {
        String expression = "^[a-z0-9_-]{3,15}$";
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        compositeDisposable.clear();
        super.onDestroy();
    }
}
