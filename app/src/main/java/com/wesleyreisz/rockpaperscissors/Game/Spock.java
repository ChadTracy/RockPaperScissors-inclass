package com.wesleyreisz.rockpaperscissors.Game;

/**
 * Created by Chad on 9/15/2016.
 */

import com.wesleyreisz.rockpaperscissors.R;

public class Spock implements IEval {
    @Override
    public String Evaluate(Integer otherChoice) {
        String result = null;

        if (otherChoice == R.id.btnPaper)
        {
            result = GameUtils.LOSES_TO;
        }
        if (otherChoice == R.id.btnLizard)
        {
            result = GameUtils.LOSES_TO;
        }
        if (otherChoice == R.id.btnRock)
        {
            result = GameUtils.BEATS;
        }
        if (otherChoice == R.id.btnScissors)
        {
            result = GameUtils.BEATS;
        }
        else if(otherChoice == R.id.btnSpock)
        {
            result = GameUtils.TIES;
        }

        return result;
    }
}
