package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetPackageName_ValidInput_ReturnsPackageName {

    @Test
    public void getPackageName_ValidInput_ReturnsPackageName() {
        String amiName = "ami-name";
        String packageName = "ami-name";
        assertEquals(packageName, new AppVersion(amiName).getPackageName());
    }

}