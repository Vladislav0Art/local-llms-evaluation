package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPackageName_ReturnsCorrectPackageName {

    @Test
    public void getPackageName_ReturnsCorrectPackageName() {
        String packageName = AppVersion.parseName("1.0-ami.x86_64").getPackageName();
        assertEquals(NameConstants.AMI_PACKAGE, packageName);
    }

}