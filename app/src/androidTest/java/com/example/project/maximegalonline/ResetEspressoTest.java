package com.example.project.maximegalonline;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;


import com.csci3130.project.maximegalonline.LoginActivity;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class ResetEspressoTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityrule =
            new ActivityTestRule<>(LoginActivity.class);


    @Test
    public void testResetEmail() {
	String email = "";
	assert(false);
    }


}
