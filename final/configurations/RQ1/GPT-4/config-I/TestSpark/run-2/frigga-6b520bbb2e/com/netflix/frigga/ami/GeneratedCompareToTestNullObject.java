package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTestNullObject {

    @Test
    public void compareToTestNullObject() {
        AppVersion appVersion = AppVersion.parseName("myApp-1.0.0-h123456");

        int compare = appVersion.compareTo(null);
        assertEquals(1, compare);
    }

}