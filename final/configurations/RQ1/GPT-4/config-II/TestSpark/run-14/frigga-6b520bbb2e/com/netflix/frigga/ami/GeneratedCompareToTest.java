package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver1 = AppVersion.parseName(name);
        AppVersion ver2 = AppVersion.parseName(name);

        assertEquals(0, ver1.compareTo(ver2));
    }

}