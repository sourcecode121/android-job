package com.example.androidjob;

import android.support.annotation.NonNull;
import android.util.Log;

import com.evernote.android.job.Job;

/**
 * Created by Anand on 14/01/2017.
 */
public class AjJob extends Job {

    public static final String JOB_TAG = "aj_job";

    @NonNull
    @Override
    protected Result onRunJob(Params params) {
        Log.v("AjJob", "Successfully completed: " + params.getTag());
        return Result.SUCCESS;
    }
}
