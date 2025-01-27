package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ValidChangelist {

    @Test
    public void getChangelist_ValidChangelist() {
        String changelist = "changelist-id";
        AppVersion appVersion = new AppVersion("ami-123456789012345678901234567890", "", changelist);
        assertEquals(changelist, appVersion.getChangelist());
    }

}