package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import com.netflix.frigga.ami.AppVersion;
import com.netflix.frigga.ami.AppVersion.AppVersionParseException;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() throws AppVersionParseException {
        AppVersion appVersion = AppVersion.parseName("test");
        assertNotNull(appVersion);
    }

}