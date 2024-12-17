package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageNameReturnsCorrectPackageName {

    @Test
    public void getPackageNameReturnsCorrectPackageName() {
        AppVersion appVersion = new AppVersion("1.0-2.0");
        String packageName = appVersion.getPackageName();
        // Test implementation
    }

}