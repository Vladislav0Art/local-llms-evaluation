package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestHashCode {

    @Test
    public void TestHashCode() {
        String amiName = "AmazonLinux 2 x86_64 AMI";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(AppVersion.class.hashCode(), appVersion.hashCode());
    }

}