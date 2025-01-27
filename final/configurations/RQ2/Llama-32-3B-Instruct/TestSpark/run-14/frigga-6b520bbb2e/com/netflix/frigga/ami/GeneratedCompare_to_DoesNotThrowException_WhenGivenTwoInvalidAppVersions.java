package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedCompare_to_DoesNotThrowException_WhenGivenTwoInvalidAppVersions {

    @Test
    public void compare_to_DoesNotThrowException_WhenGivenTwoInvalidAppVersions() {
        AppVersion appVersion1 = new AppVersion("abc.def.ghi-jkl", "com.example.app");
        AppVersion appVersion2 = new AppVersion("def.ghi.jkl-mno", "com.example.app2");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(-1, result);
    }

}