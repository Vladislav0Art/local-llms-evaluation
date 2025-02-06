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

public class GeneratedGetChangelist_DecommissionedTest {

    @Test
    public void getChangelist_DecommissionedTest() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.CHERALIST, appVersion.getChangelist());
    }

}