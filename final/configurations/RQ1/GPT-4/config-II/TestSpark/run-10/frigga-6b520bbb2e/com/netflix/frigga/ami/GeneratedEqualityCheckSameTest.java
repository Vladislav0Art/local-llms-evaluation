package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualityCheckSameTest {

    @Test
    public void equalityCheckSameTest() {
        AppVersion version1 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");
        AppVersion version2 = AppVersion.parseName("subscriberha-1.0.0-h586499/WE-WAPP-subscriberha/150");

        assertTrue(version1.equals(version2));
    }

}