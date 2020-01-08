package com.mzw.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mzw.designpatterns.command.DownCommand;
import com.mzw.designpatterns.command.ICommand;
import com.mzw.designpatterns.command.LeftCommand;
import com.mzw.designpatterns.command.RightCommand;
import com.mzw.designpatterns.command.RussiaSquare;
import com.mzw.designpatterns.command.TransCommand;
import com.mzw.designpatterns.obsever.Man;
import com.mzw.designpatterns.obsever.OldMan;
import com.mzw.designpatterns.obsever.Weather;
import com.mzw.designpatterns.obsever.YoungMan;
import com.mzw.designpatterns.proxy.Girl;
import com.mzw.designpatterns.proxy.IPurchase;
import com.mzw.designpatterns.proxy.OverseaPurchser;
import com.mzw.designpatterns.proxy.PurchaseHandler;
import com.mzw.designpatterns.stragety.Bus;
import com.mzw.designpatterns.stragety.Taxi;
import com.mzw.designpatterns.stragety.Traffic;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView resultTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn);
        resultTv = (TextView) findViewById(R.id.resultTv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                proxy();
//                dynamicProxy();
//                command();
//                strategy();
                observer();
            }
        });
    }


    private void proxy() {
        OverseaPurchser purchser = new OverseaPurchser(new Girl());
        String s = purchser.purchase();
        showResult(s);
    }

    private IPurchase mPurchaser;

    private void dynamicProxy() {
        mPurchaser = (IPurchase) Proxy.newProxyInstance(getClassLoader(), new Class[]{IPurchase.class}, new PurchaseHandler(new Girl()));
        String s = mPurchaser.purchase();
        showResult(s);
    }

    private RussiaSquare russiaSquare;
    private int count = 0;

    private void command() {
        if (russiaSquare == null) {
            russiaSquare = new RussiaSquare();
            russiaSquare.setDown(new DownCommand());
            russiaSquare.setLeft(new LeftCommand());
            russiaSquare.setRight(new RightCommand());
            russiaSquare.setTrans(new TransCommand());
        }

        String str = "";
        switch (count % 4) {
            case 0:
                str = russiaSquare.moveLeft();
                break;

            case 1:
                str = russiaSquare.moveRight();
                break;

            case 2:
                str = russiaSquare.moveDown();
                break;

            case 3:
                str = russiaSquare.trans();
                break;
        }

        count++;
        showResult(str);
    }

    int traff = 0;

    private void strategy() {
        Traffic traffic = new Traffic();
        if (traff % 2 == 0) {
            traffic.setCaculator(new Bus());
        } else if (traff % 2 == 1) {
            traffic.setCaculator(new Taxi());
        }
        String price = traffic.traffic(10);
        showResult(price);
        traff++;
    }

    private void observer(){
        Weather weather = new Weather();
        weather.addObserver(new YoungMan());
        weather.addObserver(new Man());
        weather.addObserver(new OldMan());

        weather.temperatureDown("气温下降了");
    }

    private void showResult(String result) {
        resultTv.setText(result);
    }

}
