package local.bunayari.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //INISIALISASI VARIABEL
    int pointTeamA = 0, pointTeamB = 0;
    Button freeThrowA, tambahPlus2A, tambahPlus3A, freeThrowB, tambahPlus2B, tambahPlus3B, reset, hasil;
    TextView pointA, pointB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MEMBACA INTERFACE
        pointA = (TextView) findViewById(R.id.pointA);
        pointB = (TextView) findViewById(R.id.pointB);
        freeThrowA = (Button) findViewById(R.id.btnfreeThrowA);
        freeThrowB = (Button) findViewById(R.id.btnfreeThrowB);
        tambahPlus2A = (Button) findViewById(R.id.btntambahPlus2A);
        tambahPlus2B = (Button) findViewById(R.id.btntambahPlus2B);
        tambahPlus3A = (Button) findViewById(R.id.tambahPlus3A);
        tambahPlus3B = (Button) findViewById(R.id.tambahPlus3B);
        reset = (Button) findViewById(R.id.btnReset);
        hasil = (Button) findViewById(R.id.btnHasil);

        //TOMBOL FREE THROW TEAM A
        freeThrowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTeamA = pointTeamA + 1;
                setPointA(pointTeamA);
            }
        });

        //TOMBOL FREE THROW TEAM B
        freeThrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTeamB = pointTeamB + 1;
                setPointB(pointTeamB);
            }
        });

        //TOMBOL + 2 TEAM A
        tambahPlus2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTeamA = pointTeamA + 2;
                setPointA(pointTeamA);
            }
        });

        //TOMBOL + 2 TEAM B
        tambahPlus2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTeamB = pointTeamB + 2;
                setPointB(pointTeamB);
            }
        });

        //TOMBOL + 3 TEAM A
        tambahPlus3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTeamA = pointTeamA + 3;
                setPointA(pointTeamA);
            }
        });

        //TOMBOL + 3 TEAM B
        tambahPlus3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTeamB = pointTeamB + 3;
                setPointB(pointTeamB);
            }
        });

        //TOMBOL RESET
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointTeamA = 0;
                pointTeamB = 0;
                setPointA(pointTeamA);
                setPointB(pointTeamB);
            }
        });

        //TOMBOL HASIL
        //UNTUK MENTRANSFER NILAI VARIABEL KE HALAMAN LAIN MENGGUNAKAN INTEN
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, HasilActivity.class);
                    //MEMBERIKAN ID DATA YG MAU DI INTENT KE HALAMAN LAIN
                    i.putExtra("SKOR_A", pointTeamA);
                    i.putExtra("SKOR_B", pointTeamB);
                    startActivity(i);
            }
        });


    }

    public void setPointA (int number){
        pointA.setText(number+"");
    }

    public void setPointB (int number){
        pointB.setText(number+"");
    }


}
