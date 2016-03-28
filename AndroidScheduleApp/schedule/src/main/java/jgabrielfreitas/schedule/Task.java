package jgabrielfreitas.schedule;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import jgabrielfreitas.schedule.interfaces.TaskInterface;
import jgabrielfreitas.schedule.time.Days;

/**
 * Created by JGabrielFreitas on 27/03/16.
 */
public abstract class Task implements TaskInterface {

    protected String TAG = getClass().getSimpleName();
    List<Days> whenThisTaskWillRun = new ArrayList<>();

    private void logError(String toLog) {
        Log.e(TAG, toLog);
    }

    private void logDebug(String toLog) {
        Log.d(TAG, toLog);
    }
}
