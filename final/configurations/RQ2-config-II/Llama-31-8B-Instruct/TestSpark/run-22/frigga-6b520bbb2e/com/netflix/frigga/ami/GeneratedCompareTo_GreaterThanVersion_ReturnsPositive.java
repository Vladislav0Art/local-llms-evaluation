package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
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
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_GreaterThanVersion_ReturnsPositive {

    @Test
    public void compareTo_GreaterThanVersion_ReturnsPositive() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();
        version1.setVersion("1.2.3");
        int result = version1.compareTo(version2);
        assertTrue(result > 0);
    }

}