package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_InvalidAMIName_ReturnsNull {

    @Test
    public void parseName_InvalidAMIName_ReturnsNull() {
        String amiName = "invalid-ami-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}