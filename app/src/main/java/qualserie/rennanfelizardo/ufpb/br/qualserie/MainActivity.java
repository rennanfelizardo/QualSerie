package qualserie.rennanfelizardo.ufpb.br.qualserie;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView imagemExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        imagemExibicao = (ImageView) findViewById(R.id.ImagemExibicaoId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                 if (i==1){
                     imagemExibicao.setImageResource(R.drawable.pouco);
                 }else if (i==2){
                     imagemExibicao.setImageResource(R.drawable.medio);
                 }else if (i==3){
                     imagemExibicao.setImageResource(R.drawable.muito);
                 }else if (i==4){
                     imagemExibicao.setImageResource(R.drawable.susto);
                 }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
