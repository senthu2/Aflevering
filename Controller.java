package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    public TextField input1;
    public TextField input2;
    public TextField input3;
    public TextField input4;
    public TextField input5;
    public TextField input6;
    public TextField input7;


    public Button getNum;
    public Button clearNum;

    public void get_num(ActionEvent actionEvent) {
        Random rand = new Random();
        int[] randList = new int[7];
        //Vælger 7 random tal fra 1-36
        randList[0] = rand.nextInt(1+36);
        randList[1] = rand.nextInt(1+36);
        randList[2] = rand.nextInt(1+36);
        randList[3] = rand.nextInt(1+36);
        randList[4] = rand.nextInt(1+36);
        randList[5] = rand.nextInt(1+36);
        randList[6] = rand.nextInt(1+36);

        //Sammenligner om tallene er ens.
        if(randList[0] == randList[1] || randList[0] == randList[2] || randList[0] == randList[3] || randList[0] == randList[4] ||
                randList[0] == randList[5] || randList[0] == randList[6] || randList[1] == randList[2] || randList[1] == randList[3] || randList[1] == randList[4] ||
                randList[1] == randList[5] || randList[1] == randList[6] || randList[2] == randList[3] || randList[2] == randList[4] || randList[2] == randList[5] || randList[2] == randList[6] ||
                randList[3] == randList[4] || randList[3] == randList[5] || randList[3] == randList[6] ||
                randList[4] == randList[5] || randList[4] == randList[6] ||
                randList[5] == randList[6]){
            return;
        }else {
            for (int i = 0; i < randList.length; i++){
                int val;
                for (int j = 0; j < i; j++){
                    if(randList[i] < randList[j]){
                        val = randList[j];
                        randList[j] = randList[i];
                        randList[i] = val;
                    }
                }
            }
            input1.setText(String.valueOf(randList[0]));
            input2.setText(String.valueOf(randList[1]));
            input3.setText(String.valueOf(randList[2]));
            input4.setText(String.valueOf(randList[3]));
            input5.setText(String.valueOf(randList[4]));
            input6.setText(String.valueOf(randList[5]));
            input7.setText(String.valueOf(randList[6]));


        }


    }

    public void clear_num(ActionEvent actionEvent) {
        input1.clear();
        input2.clear();
        input3.clear();
        input4.clear();
        input5.clear();
        input6.clear();
        input7.clear();

    }
}
