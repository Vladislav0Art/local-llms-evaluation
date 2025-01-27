package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        assertEquals(AppVersion.APP_VERSION.split("-")[1].split("\\.")[0], appVersion.getCommit());
    }
}

}