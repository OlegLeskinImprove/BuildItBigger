package com.udacity.gradle.builditbigger;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by Oleg Leskin on 01.05.2017.
 */
public class GetJokeAsyncTaskTest {
    @Test
    public void onPostExecute() throws Exception {
        String result = new GetJokeAsyncTask().execute().get();
        assertNotEquals("", result);
    }

}