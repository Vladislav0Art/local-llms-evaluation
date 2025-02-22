package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion parsedName = AppVersion.parseName(amiName);

        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0", parsedName.getVersion());
        assertEquals("h150", parsedName.getCommit());
    }

}