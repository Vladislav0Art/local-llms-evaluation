package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String changelist = appVersion.getChangelist();
        assertEquals("test", changelist);
    }

}