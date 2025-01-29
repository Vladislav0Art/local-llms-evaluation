package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestEquals {

    @Test
    public void TestEquals() {
        String amiName1 = "AmazonLinux 2 x86_64 AMI";
        String amiName2 = "AmazonLinux 2 x86_64 AMI";
        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        AppVersion appVersion2 = AppVersion.parseName(amiName2);

        assertTrue(appVersion1.equals(appVersion2));
    }

}