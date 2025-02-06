package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageName_ReturnsPackageNamesCorrectly {

    @Mock
    private String amiName;

    @Mock
    private Pattern pattern;

    @Test
    public void getPackageName_ReturnsPackageNamesCorrectly() {
        String[] packageNames = {"com.netflix.frigga.ami"};
        when(com.netflix.frigga.NameConstants.getPackageNames()).thenReturn(packageNames);
        AppVersion appVersion = new AppVersion("1", "2", "3");
        assertEquals(packageNames[0], appVersion.getPackageName());
    }

}