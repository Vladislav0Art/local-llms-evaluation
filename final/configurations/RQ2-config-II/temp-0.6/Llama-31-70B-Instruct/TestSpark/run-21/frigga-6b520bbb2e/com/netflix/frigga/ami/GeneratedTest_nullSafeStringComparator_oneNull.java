package com.netflix.frigga.ami;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedTest_nullSafeStringComparator_oneNull {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void test_nullSafeStringComparator_oneNull() {
        String one = "test1";
        String two = null;

        int result = appVersion.nullSafeStringComparator(one, two);

        assertEquals("Expected result to be 1", 1, result);
    }

}