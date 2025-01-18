package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        String changelist = "change1";
        AppVersion appVersion = AppVersion.parseName(changelist);
        assertEquals(changelist, appVersion.getChangelist());
    }

}