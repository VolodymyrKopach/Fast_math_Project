package kopach.fast.math;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

/**
 * Created by Руслан on 11.08.2017.
 */

public class MyPreference {
    static Preferences preferences;
    private static int BSGame5;

    public MyPreference() {
        preferences = Gdx.app.getPreferences("FastPref");
    }

    public static int getMoney() {
        checkPref();
        return preferences.getInteger("money", 0);
    }

    public static void setMoney(int money) {
        preferences.putInteger("money", money);
        preferences.flush();
    }

    public static int getBSGame4() {
        checkPref();
        return preferences.getInteger("bs4", 0);
    }

    private static void checkPref() {
        if (preferences == null) {
            preferences = Gdx.app.getPreferences("FastPref");
        }
    }

    public static void setBSGame4(int bs) {
        preferences.putInteger("bs4", bs);
        preferences.flush();
    }

    public static void setBSGame1(int bs) {
        preferences.putInteger("bs1", bs);
        preferences.flush();
    }

    public static int getBSGame1() {
        checkPref();
        return preferences.getInteger("bs1", 0);
    }

    public static int getBSGame5() {
        checkPref();
        return preferences.getInteger("bs5", 0);
    }

    public static void setBSGame5(int bestScoreGame5) {
        preferences.putInteger("bs5", bestScoreGame5);
        preferences.flush();
    }
}