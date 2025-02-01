package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        String amiName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String amiName2 = "distributorha-2.0.0-874654.j250/WE-WAPP-distributorha/250";
        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        AppVersion appVersion2 = AppVersion.parseName(amiName2);
        assertFalse(appVersion1.equals(appVersion2));
    }

}