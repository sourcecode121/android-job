package com.example.androidjob;

import android.app.Application;

import com.evernote.android.job.JobManager;
import com.evernote.android.job.JobRequest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anand on 14/01/2017.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        JobManager.create(this).addJobCreator(new AjJobCreator());

        new JobRequest.Builder(AjJob.JOB_TAG)
                .setExecutionWindow(TimeUnit.SECONDS.toMillis(3), TimeUnit.SECONDS.toMillis(7))
                .build()
                .schedule();
    }
}
