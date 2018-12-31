package com.fabricadmin.logiangle.fabricspaadmin.sessionManagement;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.fabricadmin.logiangle.fabricspaadmin.JavaClasses.AllConstants;

public class SessionManagement {
    public static SharedPreferences getSharedPreferences(Context ctx)
    {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setLoggedInSessionID(Context ctx,String logInID)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(AllConstants.KEY_LOGIN_ID,logInID);
        editor.apply();
        editor.commit();
    }

    public static String getLoggedInSessionID(Context ctx)
    {
        return getSharedPreferences(ctx).getString(AllConstants.KEY_LOGIN_ID,"");
    }

    public static void setUserLoggedInStatus(Context ctx, boolean status)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putBoolean(AllConstants.LOGGEDIN_SHARED_PREF, status);
        editor.commit();
    }

    public static boolean getUserLoggedInStatus(Context ctx)
    {
        return getSharedPreferences(ctx).getBoolean(AllConstants.LOGGEDIN_SHARED_PREF, false);
    }

    public static void clearLoggedInEmailAddress(Context ctx)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.remove(AllConstants.KEY_LOGIN_ID);
        editor.remove(AllConstants.LOGGEDIN_SHARED_PREF);
        editor.commit();
        editor.apply();
    }

}
