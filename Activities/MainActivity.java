package com.goodchild.gigpig.activities.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.facebook.login.widget.LoginButton;
import com.firebase.ui.auth.AuthUI;
import com.goodchild.gigpig.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth auth;
    private static final int RC_SIGN_IN = 0;
    LoginButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            //current user sign in
            Log.d("AUTH","User Logged In" + auth.getCurrentUser().getEmail());
        } else {
            AuthUI.getInstance().createSignInIntentBuilder();
            startActivityForResult(AuthUI.getInstance()
                    .createSignInIntentBuilder()
                    .setLogo(R.drawable.eightballguns)
                    .setProviders(
                            AuthUI.EMAIL_PROVIDER,
                            AuthUI.FACEBOOK_PROVIDER,
                            AuthUI.GOOGLE_PROVIDER)
                    .build(),RC_SIGN_IN);
            Log.d("AUTH","StartActivityForResult: " + AuthUI.getInstance());
        }
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        //findViewById(R.id.log_out_button).setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RC_SIGN_IN) {
            if(resultCode == RESULT_OK) {
                //user logged in
                Log.d("AUTH","Current user e-Mail: " + auth.getCurrentUser().getEmail());
                Log.d("AUTH","Current user Display Name: " + auth.getCurrentUser().getDisplayName());
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
            }
        }
    }

    @Override
    public void onClick(View view) {
    if (view.getId() == R.id.log_out_button) {
     AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
         @Override
         public void onComplete(@NonNull Task<Void> task) {
             Log.d("AUTH","User Logged Out");
             AuthUI.getInstance().createSignInIntentBuilder();
             startActivityForResult(AuthUI.getInstance()
                     .createSignInIntentBuilder()
                     .setLogo(R.drawable.eightballguns)
                     .setProviders(
                             AuthUI.FACEBOOK_PROVIDER,
                             AuthUI.EMAIL_PROVIDER,
                             AuthUI.GOOGLE_PROVIDER)
                     .build(),RC_SIGN_IN);
             Log.d("AUTH","StartActivityForResultBOTTOM: " + AuthUI.getInstance());


             //finish();
         }
     });
 }
    }


}
