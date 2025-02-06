package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageNameReturnsPackageName {

    @Mock
    private Pattern getAppVersionPatternMock();

    @Test
    public void getPackageNameReturnsPackageName() {
        AppVersion appVersion = new AppVersion("ami-name", "build-number", "commit-hash");
        String packageName = appVersion.getPackageName();
        assertTrue(packageName.equals(NameConstants.AMI_NAME));
    }

}