package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

public class GeneratedTestCompareTo {

    @Mock
    private Pattern pattern;

    @Spy
    private AppVersion appVersion;

    @InjectMocks
    private AppVersion appVersion2;

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        when(appVersion.compareTo(appVersion2)).thenReturn(-1);

        int result = appVersion.compare(appVersion1, appVersion2);
        assertEquals(-1, result);
    }

}