package com.example.rcss.tictactoe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int counter = 0, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0;
    int[][] arr = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
    int cheaker=0;

    public void aBut(View view) {
        if(a==0){
            counter++;
        if (counter % 2 != 0) {
            TextView text1 = (TextView) findViewById(R.id.a);
            text1.setText("X");
            arr[0][0] = 1;
        } else {
            TextView text1 = (TextView) findViewById(R.id.a);
            text1.setText("0");
            arr[0][0] = 0;
        }
        a = 1;
            check(view);
    }

}
    public void bBut(View view) {
        if(b==0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.b);
                text1.setText("X");
                arr[0][1] = 1;
            } else {
                TextView text1 = (TextView) findViewById(R.id.b);
                text1.setText("0");
                arr[0][1] = 0;
            }
            b=1;
            check(view);
        }
    }
    public void cBut(View view) {

        if(c==0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.c);
                text1.setText("X");
                arr[0][2] = 1;
            } else {
                TextView text1 = (TextView) findViewById(R.id.c);
                text1.setText("0");
                arr[0][2] = 0;
            }
            c = 1;
            check(view);
        }
    }
    public void dBut(View view) {

        if(d==0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.d);
                text1.setText("X");
                arr[1][0] = 1;
            } else {
                TextView text1 = (TextView) findViewById(R.id.d);
                text1.setText("0");
                arr[1][0] = 0;
            }d=1;
            check(view);
        }
    }
    public void eBut(View view) {
                if (e == 0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.e);
                text1.setText("X");
                arr[1][1] = 1;
            } else {
                TextView text1 = (TextView) findViewById(R.id.e);
                text1.setText("0");
                arr[1][1] = 0;
            }
            e = 1;
                    check(view);
        }
    }
    public void fBut(View view) {
                if (f == 0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.f);
                text1.setText("X");
                arr[1][2]=1;
            } else {
                TextView text1 = (TextView) findViewById(R.id.f);
                text1.setText("0");
                arr[1][2]=0;
            }
            f=1;
                    check(view);
        }
    }
    public void gBut(View view) {
        if (g == 0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.g);
                text1.setText("X");
                arr[2][0]=1;
            } else {
                TextView text1 = (TextView) findViewById(R.id.g);
                text1.setText("0");
                arr[2][0]=0;
            }g=1;
            check(view);
        }
    }
    public void hBut(View view) {
        if (h == 0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.h);
                text1.setText("X");
                arr[2][1]=1;
            } else {
                TextView text1 = (TextView) findViewById(R.id.h);
                text1.setText("0");
                arr[2][1]=0;
            }
            h = 1;
            check(view);
        }
    }
    public void iBut(View view) {
        if (i == 0) {
            counter++;
            if (counter % 2 != 0) {
                TextView text1 = (TextView) findViewById(R.id.i);
                text1.setText("X");
                arr[2][2]=1;
            } else {

                TextView text1 = (TextView) findViewById(R.id.i);
                text1.setText("0");
                arr[2][2]=0;
            }
            i = 1;
            check(view);
        }
    }

    private void check(View view) {
        if (cheaker == 0) {
            if (arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] && (arr[0][2] == 1 || arr[0][2] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }
            }
            if (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] && (arr[1][2] == 1 || arr[1][2] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }
            }
            if (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] && (arr[2][2] == 1 || arr[2][2] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }
            }

            if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && (arr[1][0] == 1 || arr[1][0] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }
            }
            if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && (arr[1][1] == 1 || arr[1][1] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }
            }
            if (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2] && (arr[2][2] == 1 || arr[2][2] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }
            }
            if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && (arr[2][2] == 1 || arr[2][2] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }
            }
            if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && (arr[0][2] == 1 || arr[0][2] == 0)) {
                cheaker=1;
                TextView text2 = (TextView) findViewById(R.id.edittext1);
                String player1 = text2.getText().toString();
                TextView text3 = (TextView) findViewById(R.id.edittext2);
                String player2 = text3.getText().toString();
                if (counter % 2 != 0) {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player1 + " Wins");
                } else {
                    TextView text1 = (TextView) findViewById(R.id.ans);
                    text1.setText(player2 + " Wins");
                }

            }

        }
    }


        public void reset(View view){
            TextView reset1 = (TextView) findViewById(R.id.a);
            reset1.setText(" ");
            TextView reset2 = (TextView) findViewById(R.id.b);
            reset2.setText(" ");
            TextView reset3 = (TextView) findViewById(R.id.c);
            reset3.setText(" ");
            TextView reset4 = (TextView) findViewById(R.id.d);
            reset4.setText(" ");
            TextView reset5 = (TextView) findViewById(R.id.e);
            reset5.setText(" ");
            TextView reset6 = (TextView) findViewById(R.id.f);
            reset6.setText(" ");
            TextView reset7 = (TextView) findViewById(R.id.g);
            reset7.setText(" ");
            TextView reset8 = (TextView) findViewById(R.id.h);
            reset8.setText(" ");
            TextView reset9 = (TextView) findViewById(R.id.i);
            reset9.setText(" ");
            TextView text1 = (TextView) findViewById(R.id.ans);
            text1.setText(" ");
            counter = 0; a = 0; b = 0; c = 0;d = 0; e = 0; f = 0; g = 0; h = 0; i = 0;
            arr[0][0]=-1;
            arr[1][0]=-1;
            arr[2][0]=-1;
            arr[0][1]=-1;
            arr[1][1]=-1;
            arr[2][1]=-1;
            arr[0][2]=-1;
            arr[1][2]=-1;
            arr[2][2]=-1;
            cheaker=0;
        }
}





