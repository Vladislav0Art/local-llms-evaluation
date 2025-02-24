package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseNameTest1 {

    @Test
    public void parseNameTest1() {
        AppVersion appVersion = new AppVersion();
        String amiName = "test1";

        AppVersion result = appVersion.parseName(amiName);

        assertNotNull(result);
    }

}