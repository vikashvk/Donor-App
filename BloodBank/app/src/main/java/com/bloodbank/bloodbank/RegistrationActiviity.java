package com.bloodbank.bloodbank;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.bloodbank.com.bloodbank.dao.RegistrationDao;
import com.bloodbank.model.Donor;

/**
 * Created by v2 on 9/21/2019.
 */

public class RegistrationActiviity extends Activity {
    EditText id,name,phNo,email,pwd,rePwd;
    Spinner bloodGrp;
    Button register;
    RegistrationDao registerationDao;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=(EditText)findViewById(R.id.txtUid);
        name=(EditText)findViewById(R.id.txtName);
        phNo=(EditText)findViewById(R.id.txtPhno);
        email=(EditText)findViewById(R.id.txtEmail);
        pwd=(EditText)findViewById(R.id.txtPwd);
        rePwd=(EditText)findViewById(R.id.txtRePassword);
        bloodGrp=(Spinner)findViewById(R.id.txtBlood);
        register=(Button)findViewById(R.id.btnLogin);

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String edId=id.getText().toString();
                String edName=name.getText().toString();
                String edPhNo=phNo.getText().toString();
                String edEmail=email.getText().toString();
                String edPwd=pwd.getText().toString();
                String edRePwd=rePwd.getText().toString();
                String edBloodGrp=bloodGrp.getSelectedItem().toString();

                if(edRePwd.equals(edPwd) ){
                    registerationDao=new RegistrationDao(RegistrationActiviity.this);
                    Donor donor=new Donor();
                    donor.setuId(edId);
                    donor.setName(edName);
                    donor.setPhNum(edPhNo);
                    donor.seteMail(edEmail);
                    donor.setPwd(edPwd);
                    donor.setRePwd(edRePwd);
                    donor.setBloodGroup(edBloodGrp);

                    registerationDao.addDetails(donor);

                    Toast.makeText(getApplicationContext(), "You are registered", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_LONG).show();
                    pwd.setText("");
                    rePwd.setText("");
                }
            }
        });

    }

}