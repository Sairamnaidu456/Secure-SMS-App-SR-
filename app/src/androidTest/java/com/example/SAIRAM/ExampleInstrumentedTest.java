/*
 *
 *
 *  *
 *
 *  *  Created By SAI RAM GUDI on 09/09/2020 05:00 PM
 *
 *  *  Copyright © 2020. All rights reserved © 2020
 *
 *  *  Last Modified: 10/09/2020 7:30 PM
 *
 *  *
 *
 *
 *
 */

package com.example.SAIRAM;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.aesrajat", appContext.getPackageName());
    }
}
