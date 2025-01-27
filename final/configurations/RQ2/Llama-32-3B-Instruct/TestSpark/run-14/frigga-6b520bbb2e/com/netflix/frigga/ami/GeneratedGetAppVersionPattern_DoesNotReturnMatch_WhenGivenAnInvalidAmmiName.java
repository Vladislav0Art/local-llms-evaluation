package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedGetAppVersionPattern_DoesNotReturnMatch_WhenGivenAnInvalidAmmiName {

    @Test
    public void getAppVersionPattern_DoesNotReturnMatch_WhenGivenAnInvalidAmmiName() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("abc.def.ghi-jkl");
        assertFalse(matcher.matches());
    }

}