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
public class GeneratedCompareTo_SameVersion_ReturnsZero {

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.2.3");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.2.3");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

}