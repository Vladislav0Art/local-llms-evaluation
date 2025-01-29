package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageName {

    @Mock
    private PackageManager mockPackageManager;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void getPackageName() {
        String actual = new AppVersion("ami-name").getPackageName();
        assertEquals("ami-name", actual);

        Mockito.when(mockPackageManager.getPackageList()).thenReturn(Arrays.asList("ami-name"));

        Assert.assertTrue(new AppVersion("ami-name").getPackageName().equals("ami-name"));
    }

}