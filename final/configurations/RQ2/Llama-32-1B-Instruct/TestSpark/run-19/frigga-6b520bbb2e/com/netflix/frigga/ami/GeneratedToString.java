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
public class GeneratedToString {

    @Mock
    private PackageManager mockPackageManager;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void toString() {
        String actual = new AppVersion("ami-name");
        assertEquals("[methodUnderTest][Scenario]Test", actual);

        Mockito.when(mockPackageManager.getPackageList()).thenReturn(Arrays.asList("ami-name"));

        Assert.assertTrue(new AppVersion("ami-name").toString().equals("[methodUnderTest][Scenario]Test"));
    }

}