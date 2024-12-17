package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCodeReturnsCorrectHashCode {

    @Test
    public void hashCodeReturnsCorrectHashCode() {
        AppVersion appVersion = new AppVersion("1.0-2.0");
        int hash = appVersion.hashCode();
        // Test implementation
    }

}