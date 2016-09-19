package com.wesleyreisz.rockpaperscissors.Game;

import android.graphics.Color;
import android.widget.Toast;

import com.wesleyreisz.rockpaperscissors.R;

import java.util.Random;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    public static final String BEATS = "beats";
    public static final String LOSES_TO = "loses to";
    public static final String TIES = "ties";
    public static final int CHOICES = 5;




    public static Integer getComputerChoice(){

        Random rand = new Random();

        int n = rand.nextInt(CHOICES) + 1;
        if(n==1){
            return R.id.btnPaper;
        }else if(n==2){
            return R.id.btnRock;
        }else if(n==3){
            return R.id.btnScissors;
        }
        else if(n==4)
        {
            return R.id.btnLizard;
        }
        else
        {
            return R.id.btnSpock;
        }

    }

    static Integer compChoice = getComputerChoice();

    public static String evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {


        String eval;

        if (playerSelectedChoice == R.id.btnRock)
        {
            Rock rock = new Rock();
            eval = rock.Evaluate(computerSelectedChoice);
        }
        else if (playerSelectedChoice == R.id.btnScissors)
        {
            Scissors scissors = new Scissors();
            eval = scissors.Evaluate(computerSelectedChoice);

        }
        else if (playerSelectedChoice == R.id.btnPaper)
        {
            Paper paper = new Paper();
            eval = paper.Evaluate(computerSelectedChoice);
        }
        else if (playerSelectedChoice == R.id.btnSpock)
        {
            Spock spock = new Spock();
            eval = spock.Evaluate(computerSelectedChoice);
        }
        else
        {
            Lizard lizard = new Lizard();
            eval = lizard.Evaluate(computerSelectedChoice);
        }


        return eval;

    }

    public static Integer convertButtonToImage(Integer buttonChoice) {
        if(buttonChoice==R.id.btnRock){
            return R.drawable.rock;
        }else if (buttonChoice==R.id.btnPaper){
            return R.drawable.paper;
        }else if(buttonChoice==R.id.btnScissors){
            return R.drawable.scissors;
        }
        else if(buttonChoice==R.id.btnSpock){
            return R.drawable.spock;
        }

        else{
            return R.drawable.lizard;
        }
    }

    public static int defineTextColor(String msg) {
        if(GameUtils.LOSES_TO.equalsIgnoreCase(msg)){
            return Color.RED;
        }else if(GameUtils.BEATS.equalsIgnoreCase(msg)){
            return Color.GREEN;
        }else{
            return Color.BLACK;
        }
    }



}

