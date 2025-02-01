package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsNotEqualObjectsTest {

    @Test
    public void equalsNotEqualObjectsTest() {
        String name1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String name2 = "subscriberhb-1.0.0-586499.h150/WE-WAPP-subscriberhb/150";
        AppVersion ver1 = AppVersion.parseName(name1);
        AppVersion ver2 = AppVersion.parseName(name2);

        assertFalse(ver1.equals(ver2));
    }

}