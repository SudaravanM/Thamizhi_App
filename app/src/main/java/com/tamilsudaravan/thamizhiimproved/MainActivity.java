package com.tamilsudaravan.thamizhiimproved;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView tamilText, thamizhiText;
    Button button;
    String tamText, thamText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface thamizhiface = Typeface.createFromAsset(getAssets(), "Adinatha-Tamil-Brahmi.otf");
        Typeface tamilface = Typeface.createFromAsset(getAssets(), "baamini.ttf");
        tamilText = (TextView) findViewById(R.id.tamilText);
        tamilText.setTypeface(tamilface);
        thamizhiText = (TextView) findViewById(R.id.thamizhiText);
        thamizhiText.setMovementMethod(new ScrollingMovementMethod());
        thamizhiText.setTypeface(thamizhiface);
        button = (Button) findViewById(R.id.button);
    }

    public void changeLan(View view) {
        tamText = tamilText.getText().toString();
        thamText = TamToThamizhi(tamText);
        thamizhiText.setText(thamText);
    }

    public String TamToThamizhi(String s) {
        String b = "";
        int len = s.length();
//        if(String.valueOf(s.charAt(0)).equals("கா")){
        for(int i =0; i<s.length();i++){
            Log.i("Tamil input", String.valueOf(s.charAt(i)));
            Log.i("String Len", String.valueOf(s.length()));
        }
//        }
        for (int i = 0; i < len; i++) {
            int n = s.codePointAt(i);
            switch (n) {
                case 0xB85:  //A
                    b += "\uD804\uDC05";//0x11013&0x11038
                    //b += "\uD804\uDC13\uD804\uDC38";
                    //b+="\uD804\uDC13\\uD804\uDC38\n";
                    break;
                case 0xB86:  //Aa
                    b += "\uD804\uDC06";
                    break;
                case 0xB87:  //
                    b += "\uD804\uDC07";
                    break;
                case 0xB88:
                    b += "\uD804\uDC08";
                    break;
                case 0xB89:
                    b += "\uD804\uDC09";
                    break;
                case 0xB8A:
                    b += "\uD804\uDC0A";
                    break;
                case 0xB8E:
                    b += "\uD804\uDC0F\uD804\uDC46";
                    break;
                case 0xB8F:
                    b += "\uD804\uDC0F";
                    break;
                case 0xB90:
                    b += "\uD804\uDC10";
                    break;
                case 0xB92:
                    b += "\uD804\uDC11\uD804\uDC46";
                    break;
                case 0xB93:
                    b += "\uD804\uDC11";
                    break;
                case 0xB94:
                    b += "\uD804\uDC12";
                    break;
                case (0xB95)://kha
                    b += "\uD804\uDC13";
                    break;
                case (0xB99)://kha
                    b += "\uD804\uDC17";
                    break;
                case (0xB9A)://kha
                    b += "\uD804\uDC18";
                    break;
                case (0xB9E)://kha
                    b += "\uD804\uDC1C";
                    break;
                case (0xB9F)://kha
                    b += "\uD804\uDC1D";
                    break;
                case (0xBA3)://kha
                    b += "\uD804\uDC21";
                    break;
                case (0xBA4)://kha
                    b += "\uD804\uDC22";
                    break;
                case (0xBA8)://kha
                    b += "\uD804\uDC26";
                    break;
                case (0xBA9)://kha
                    b += "\uD804\uDC37";
                    break;
                case (0xBAA)://kha
                    b += "\uD804\uDC27";
                    break;
                case (0xBAE)://kha
                    b += "\uD804\uDC2B";
                    break;
                case (0xBAF)://kha
                    b += "\uD804\uDC2C";
                    break;
                case (0xBB0)://kha
                    b += "\uD804\uDC2D";
                    break;
                case (0xBB1)://kha
                    b += "\uD804\uDC36";
                    break;
                case (0xBB2)://kha
                    b += "\uD804\uDC2E";
                    break;
                case (0xBB3)://kha
                    b += "\uD804\uDC34";
                    break;
                case (0xBB4)://kha
                    b += "\uD804\uDC35";
                    break;
                case (0xBB5)://kha
                    b += "\uD804\uDC2F";
                    break;
//              case 0xBBE:
//                    b += getUnicodeChar(0x11038);
                case 0xB83:
                    b+= "\uD804\uDC02";
                    break;
                case 0xB82:
                    b+="\u0B82";
                    break;
                case 0xBBE:
                    b+="\uD804\uDC38";
                    break;
                case 0xBBF:
                    b+="\uD804\uDC3A";
                    break;
                case 0xBC0:
                    b+="\uD804\uDC3B";
                    break;
                case 0xBC1:
                    b+="\uD804\uDC3C";
                    break;
                case 0xBC2:
                    b+="\uD804\uDC3D";
                    break;
                case 0xBC6:
                    b+="\uD804\uDC42\uD804\uDC46";
                    break;
                case 0xBC7:
                    b+="\uD804\uDC42";
                    break;
                case 0xBC8:
                    b+="\uD804\uDC43";
                    break;
                case 0xBCA:
                    b+="\uD804\uDC44\uD804\uDC46";
                    break;
                case 0xBCB:
                    b+="\uD804\uDC44";
                    break;
                case 0xBCC:
                    b+="\uD804\uDC45";
                    break;
                case 0xBCD:
                    b+="\uD804\uDC46";
                    break;
                case 0xBD7:
                    b+="\u0BD7";
                    break;
                case 0xBB7:
                    b+="\uD804\uDC31";
                    break;
                case 0xBB8:
                    b+="\uD804\uDC32";
                    break;
                case 0xBB9:
                    b+="\uD804\uDC33";
                    break;
                case 0xB9C:
                    b+="\uD804\uDC1A";
                    break;
                default:
                    b += getUnicodeChar(n);
                    break;
            }
        }
        Log.i("Word",b);
        return b;
    }
    private String getUnicodeChar ( int unicode){
        return new String(Character.toChars(unicode));
    }
}