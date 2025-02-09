package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion app1 = new AppVersion("1.0.0");
        AppVersion app2 = new AppVersion("1.0.1");

        assertTrue(app1.compareTo(app2) < 0);
    }

}