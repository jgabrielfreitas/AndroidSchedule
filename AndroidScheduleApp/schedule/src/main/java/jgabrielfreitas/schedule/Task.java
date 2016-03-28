package jgabrielfreitas.schedule;

import android.util.Log;

import jgabrielfreitas.schedule.interfaces.TaskInterface;

/**
 * Created by JGabrielFreitas on 27/03/16.
 */
public abstract class Task implements TaskInterface {

    protected String TAG = getClass().getSimpleName();

    private void logError(String toLog) {
        Log.e(TAG, toLog);
    }

    private void logDebug(String toLog) {
        Log.d(TAG, toLog);
    }
}
