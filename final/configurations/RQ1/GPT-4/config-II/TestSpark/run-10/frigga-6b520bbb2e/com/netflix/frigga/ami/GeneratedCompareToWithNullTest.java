package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToWithNullTest {

    @Test
    public void compareToWithNullTest() {
        AppVersion version1 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion version2 = null;

        int comparison = version1.compareTo(version2);

        assertEquals(1, comparison);
    }

}