package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

public class GeneratedTestGetVersion {

    @Mock
    private Pattern pattern;

    @Spy
    private AppVersion appVersion;

    @InjectMocks
    private AppVersion appVersion2;

    @Test
    public void testGetVersion() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);
        assertEquals("1.0.0", parsedVersion.getVersion());
    }

}