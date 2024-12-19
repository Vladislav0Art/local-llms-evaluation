package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToStringReturnsCorrectStringWhenAllValuesSet {

    @Test
    public void toStringReturnsCorrectStringWhenAllValuesSet() {
        String amiName = "1.0-1";
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals("AppVersion{" + "amiName='" + amiName + '\'' +
                ", packageName='" + appVersion.getPackageName() + '\'' +
                ", version='" + appVersion.getVersion() + '\'' +
                ", buildJobName='" + appVersion.getBuildJobName() + '\'' +
                ", buildNumber='" + appVersion.getBuildNumber() + '\'' +
                ", commit='" + appVersion.getCommit() + '\'' + "}", appVersion.toString());
    }

}