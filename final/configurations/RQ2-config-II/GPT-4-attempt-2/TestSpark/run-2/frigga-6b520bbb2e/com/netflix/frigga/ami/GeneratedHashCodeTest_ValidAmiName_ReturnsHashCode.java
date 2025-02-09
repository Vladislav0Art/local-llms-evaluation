package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedHashCodeTest_ValidAmiName_ReturnsHashCode {

    @Test
    public void hashCodeTest_ValidAmiName_ReturnsHashCode() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertEquals(appVersion.hashCode(), AppVersion.parseName("validAmiName").hashCode());
    }

}