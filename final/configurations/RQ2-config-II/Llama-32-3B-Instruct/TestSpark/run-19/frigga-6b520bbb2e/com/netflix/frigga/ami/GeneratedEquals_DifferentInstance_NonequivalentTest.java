package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Collections;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;
import org.mockito.MockingDetails;

public class GeneratedEquals_DifferentInstance_NonequivalentTest {

    @Test
    public void equals_DifferentInstance_NonequivalentTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertFalse(appVersion1.equals(appVersion2));
    }

}