package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedGetChangelist_ReturnsCorrectValueForNormalAmmiName {

    @Test
    public void getChangelist_ReturnsCorrectValueForNormalAmmiName() {
        AppVersion appVersion = AppVersion.parseName(NameConstants.NORMALLY_formatted);
        String changelist = appVersion.getChangelist();
        assertEquals("123", changelist);
    }

}