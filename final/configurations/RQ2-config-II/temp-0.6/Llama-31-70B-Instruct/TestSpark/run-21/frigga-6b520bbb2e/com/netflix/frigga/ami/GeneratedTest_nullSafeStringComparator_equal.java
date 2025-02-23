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

public class GeneratedTest_nullSafeStringComparator_equal {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void test_nullSafeStringComparator_equal() {
        String one = "test1";
        String two = "test1";

        int result = appVersion.nullSafeStringComparator(one, two);

        assertEquals("Expected result to be 0", 0, result);
    }

}