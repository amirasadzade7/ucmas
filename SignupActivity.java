package ir.ateam.ucmas;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import ir.ateam.ucmas.Retrofit.INodeJS;
import ir.ateam.ucmas.Retrofit.RetrofitClient;
import retrofit2.Retrofit;

public class SignupActivity extends AppCompatActivity {

    INodeJS myAPI;
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //init Api
        Retrofit retrofit = RetrofitClient.getInstance();
        myAPI = retrofit.create(INodeJS.class);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPass = findViewById(R.id.etPass);
        EditText etEmail = findViewById(R.id.etEmail);
        Button btnSignup = findViewById(R.id.btnSignup);
        TextView txtError = findViewById(R.id.txtError);
        TextView btnSignin = findViewById(R.id.btnSignin);
        TextView txtSignin = findViewById(R.id.txtSignin);
        TextView txtTitle = findViewById(R.id.txtTitle);
        Typeface nazanin = Typeface.createFromAsset(getAssets(), "fonts/nazanin.ttf");

        etUsername.setTypeface(nazanin);
        etPass.setTypeface(nazanin);
        etEmail.setTypeface(nazanin);
        btnSignup.setTypeface(nazanin);
        txtError.setTypeface(nazanin);
        btnSignin.setTypeface(nazanin);
        txtSignin.setTypeface(nazanin);
        txtTitle.setTypeface(nazanin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignupActivity.this, SigninActivity.class));
                finish();
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etEmail.getText().toString().equals("")) {
                    Toast.makeText(SignupActivity.this, "پست الکترونیکی خود را وارد کنید", Toast.LENGTH_LONG).show();
                } else if (!isEmailValid(etEmail.getText().toString())) {
                    Toast.makeText(SignupActivity.this, "پست الکترونیکی را درست وارد کنید", Toast.LENGTH_LONG).show();
                } else if (etUsername.getText().toString().equals("")) {
                    Toast.makeText(SignupActivity.this, "نام کاربری خود را وارد کنید", Toast.LENGTH_LONG).show();
                } else if (!isUsernameValid(etUsername.getText().toString())) {
                    Toast.makeText(SignupActivity.this, "نام کاربری فقط میتواند ترکیبی از حروف و اعداد و علامت _ باشد", Toast.LENGTH_LONG).show();
                } else if (etPass.getText().toString().equals("")) {
                    Toast.makeText(SignupActivity.this, "رمز عبور را وارد کنید", Toast.LENGTH_LONG).show();
                } else {
                    try {
                        compositeDisposable.add(myAPI.registerUser(etEmail.getText().toString(), etUsername.getText().toString(), etPass.getText().toString(), "0")
                                .subscribeOn(Schedulers.io())
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Consumer<String>() {
                                    @Override
                                    public void accept(String s) throws Exception {
                                        Toast.makeText(SignupActivity.this, "" + s, Toast.LENGTH_LONG).show();
                                    }
                                })
                        );
                    } catch (Exception e) {
                        Toast.makeText(SignupActivity.this, "متاسفانه مشکلی در اتصال به سرور به وجود آمده", Toast.LENGTH_LONG).show();
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
