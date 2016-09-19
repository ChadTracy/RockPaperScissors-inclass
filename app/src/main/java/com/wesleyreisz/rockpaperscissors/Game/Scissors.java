package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by Chad on 9/6/2016.
 */
public class Scissors implements IEval {

    @Override
    public String Evaluate(Integer otherChoice)
    {
        String result = null;

        if (otherChoice == R.id.btnPaper)
        {
            result = GameUtils.BEATS;
        }
        if (otherChoice == R.id.btnLizard)
        {
            result = GameUtils.BEATS;
        }
        if (otherChoice == R.id.btnRock)
        {
            result = GameUtils.LOSES_TO;
        }
        if (otherChoice == R.id.btnSpock)
        {
            result = GameUtils.LOSES_TO;
        }
        else if (otherChoice == R.id.btnScissors)
        {
            result = GameUtils.TIES;
        }

        return result;
    }
}
