package com.wesleyreisz.rockpaperscissors.Game;

import java.lang.reflect.Type;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by Chad on 9/6/2016.
 */
public class Rock implements IEval {

    @Override
    public String Evaluate(Integer otherChoice)
    {
        String result = null;

        if (otherChoice == R.id.btnPaper)
        {
            result = GameUtils.LOSES_TO;
        }
        if(otherChoice == R.id.btnSpock)
        {
            result = GameUtils.LOSES_TO;
        }
        if (otherChoice == R.id.btnScissors)
        {
            result = GameUtils.BEATS;
        }
        if (otherChoice == R.id.btnLizard)
        {
            result = GameUtils.BEATS;
        }
        else if (otherChoice == R.id.btnRock)
        {
            result = GameUtils.TIES;
        }

        return result;
    }
}
