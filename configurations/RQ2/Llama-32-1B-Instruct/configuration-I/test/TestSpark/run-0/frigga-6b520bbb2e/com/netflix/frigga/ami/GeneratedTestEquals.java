package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

public class GeneratedTestEquals {

    @Mock
    private Pattern pattern;

    @Spy
    private AppVersion appVersion;

    @InjectMocks
    private AppVersion appVersion2;

    @Test
    public void testEquals() {
        String amiName = "ami-name";

        when(appVersion.equals(new Object())).thenReturn(false);
        when(appVersion2.equals(appVersion)).thenReturn(true);

        assertTrue(appVersion.equals(appVersion2));
        assertFalse(appVersion.equals("ami-name"));
    }

}