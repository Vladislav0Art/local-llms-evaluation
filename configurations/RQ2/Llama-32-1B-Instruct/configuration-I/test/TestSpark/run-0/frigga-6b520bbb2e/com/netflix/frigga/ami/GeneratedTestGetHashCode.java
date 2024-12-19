package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

public class GeneratedTestGetHashCode {

    @Mock
    private Pattern pattern;

    @Spy
    private AppVersion appVersion;

    @InjectMocks
    private AppVersion appVersion2;

    @Test
    public void testGetHashCode() {
        AppVersion parsedVersion = appVersion.parseName("ami-name");

        assertEquals(12345, parsedVersion.hashCode());
    }

}