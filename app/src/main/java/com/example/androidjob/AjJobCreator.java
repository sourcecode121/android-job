package com.example.androidjob;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

/**
 * Created by Anand on 14/01/2017.
 */
public class AjJobCreator implements JobCreator {
    @Override
    public Job create(String tag) {
        return new AjJob();
    }
}
