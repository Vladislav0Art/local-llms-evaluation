package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_Deprecated_ReturnsDeprecatedValue {

    @Test
    public void getChangelist_Deprecated_ReturnsDeprecatedValue() {
        @Deprecated
        String changelist = "deprecated";
        AppVersion appVersion = new AppVersion(changelist);
        String result = appVersion.getChangelist();
        assertEquals(changelist, result);
    }

}