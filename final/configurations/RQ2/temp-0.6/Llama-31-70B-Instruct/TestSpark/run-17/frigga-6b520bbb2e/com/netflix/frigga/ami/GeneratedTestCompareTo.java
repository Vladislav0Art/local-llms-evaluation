package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTestCompareTo {

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion1.compareTo(appVersion2);
        verify(appVersion1, times(1)).compareTo(appVersion2);
    }

}