package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ValidInput_ReturnsChangelist {

    @Test
    public void getChangelist_ValidInput_ReturnsChangelist() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String changelist = appVersion.getChangelist();
        assertNotNull(changelist);
    }

}