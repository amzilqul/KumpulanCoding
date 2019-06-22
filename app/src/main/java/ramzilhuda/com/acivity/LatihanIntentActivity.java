package ramzilhuda.com.acivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import ramzilhuda.com.R;

public class LatihanIntentActivity extends BaseActivity {
    Button btnMoveWithDataActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_latihan_intent );
        Toolbar toolbar = findViewById ( R.id.toolbar );
        setSupportActionBar ( toolbar );

        FloatingActionButton fab = findViewById ( R.id.fab );
        fab.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Snackbar.make ( view, "Replace with your own action", Snackbar.LENGTH_LONG )
                        .setAction ( "Action", null ).show ();
            }
        } );

        findView ();
        initView ();
        initListener ();
    }

    @Override
    public void findView() {
        btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

        btnMoveWithDataActivity.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_move_activity_data:
                        Intent intent = new Intent ( LatihanIntentActivity.this, PindahDenganDataActivity.class );
                        intent.putExtra( PindahDenganDataActivity.EXTRA_NAME, "RAMZIL HUDA" );
                        intent.putExtra( PindahDenganDataActivity.EXTRA_AGE, 5 );
                        startActivity ( intent );
                        break;
                }
            }
        } );

    }

}
