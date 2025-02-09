package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelistDeprecatedThrowsExceptionTest {

    @Test
    public void getChangelistDeprecatedThrowsExceptionTest() {
        @SuppressWarnings("unused")
        String changelist = AppVersion.getChangelist();
        fail("Expected exception thrown");
    }

}