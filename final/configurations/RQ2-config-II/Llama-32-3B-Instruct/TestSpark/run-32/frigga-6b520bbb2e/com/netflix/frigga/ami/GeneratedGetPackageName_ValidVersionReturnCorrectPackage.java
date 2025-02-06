package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ValidVersionReturnCorrectPackage {

    @Test
    public void getPackageName_ValidVersionReturnCorrectPackage() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals(NameConstants.FRIGGA_AMI package,version.getPackageName());
    }

}