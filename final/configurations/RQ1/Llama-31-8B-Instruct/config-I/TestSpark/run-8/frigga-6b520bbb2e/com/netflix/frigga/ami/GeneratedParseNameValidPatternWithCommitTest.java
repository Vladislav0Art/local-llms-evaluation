package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNameValidPatternWithCommitTest {

    @Test
    public void parseNameValidPatternWithCommitTest() {
        AppVersion result = AppVersion.parseName("subscriberha-1.0.0-586499.h150");
        assertEquals("subscriberha", result.getPackageName());
        assertEquals("1.0.0", result.getVersion());
        assertEquals("586499", result.getBuildNumber());
        assertEquals("h150", result.getCommit());
        assertNull(result.getBuildJobName());
    }

}