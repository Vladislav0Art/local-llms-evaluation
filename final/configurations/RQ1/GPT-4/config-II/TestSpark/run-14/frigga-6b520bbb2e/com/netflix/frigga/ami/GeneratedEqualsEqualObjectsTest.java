package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsEqualObjectsTest {

    @Test
    public void equalsEqualObjectsTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver1 = AppVersion.parseName(name);
        AppVersion ver2 = AppVersion.parseName(name);

        assertTrue(ver1.equals(ver2));
    }

}