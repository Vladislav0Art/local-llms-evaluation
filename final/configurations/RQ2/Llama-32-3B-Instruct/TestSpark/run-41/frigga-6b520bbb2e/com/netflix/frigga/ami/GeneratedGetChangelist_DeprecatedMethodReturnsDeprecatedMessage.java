package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_DeprecatedMethodReturnsDeprecatedMessage {

    @Test
    public void getChangelist_DeprecatedMethodReturnsDeprecatedMessage() {
        String changelist = AppVersion.parseName("my-app/1.0").getChangelist();
        assertNotNull(changelist);
        assertTrue(changelist.contains("@deprecated"));
    }

}