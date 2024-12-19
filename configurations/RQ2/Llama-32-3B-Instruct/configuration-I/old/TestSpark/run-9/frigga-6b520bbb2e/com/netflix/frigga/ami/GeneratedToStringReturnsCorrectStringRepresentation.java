package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToStringReturnsCorrectStringRepresentation {

    @Test
    public void toStringReturnsCorrectStringRepresentation() {
        AppVersion appVersion = new AppVersion("1.0-2.0");
        String string = appVersion.toString();
        // Test implementation
    }

}