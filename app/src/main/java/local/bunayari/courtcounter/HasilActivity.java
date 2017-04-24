package local.bunayari.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class HasilActivity extends AppCompatActivity {
    //DEKLARASI VARIABEL
    TextView hasilSkorA, hasilSkorB, timPemenang;
    int SkorA, SkorB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //MENGAMBIL DATA DARI INTERFACE
        hasilSkorA = (TextView) findViewById((R.id.statTeamA));
        hasilSkorB = (TextView) (findViewById(R.id.statTeamB));
        timPemenang = (TextView) findViewById(R.id.timPemenang);


        //MENGAMBIL DATA DARI ID YG SUDAH DIINTEN, DG PERITAH GetIntent
        Intent i = getIntent();
        SkorA = i.getExtras().getInt("SKOR_A",0);
        SkorB = i.getExtras().getInt("SKOR_B",0);
        hasilSkorA.setText(SkorA+"");
        hasilSkorB.setText(SkorB+"");

        //MENAMPILKAN PEMENANG
        if (SkorA > SkorB) {
            timPemenang.setText("TEAM A");
        } else {
            timPemenang.setText("TEAM B");
        }


    }
}
