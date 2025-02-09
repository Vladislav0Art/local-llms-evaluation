package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedToStringTest_ValidAmiName_ContainsAmiName {

    @Test
    public void toStringTest_ValidAmiName_ContainsAmiName() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertTrue("Expected amiName inside toString result", appVersion.toString().contains("validAmiName"));
    }

}