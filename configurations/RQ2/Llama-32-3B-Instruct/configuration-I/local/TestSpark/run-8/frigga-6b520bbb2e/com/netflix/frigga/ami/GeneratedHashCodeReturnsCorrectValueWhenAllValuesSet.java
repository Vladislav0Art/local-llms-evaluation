package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedHashCodeReturnsCorrectValueWhenAllValuesSet {

    @Test
    public void hashCodeReturnsCorrectValueWhenAllValuesSet() {
        String amiName = "1.0-1";
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(appVersion.hashCode(), Math.abs(appVersion.getPackageName().hashCode()) + Math.abs(appVersion.getVersion().hashCode()) + Math.abs(appVersion.getBuildJobName().hashCode()) + Math.abs(appVersion.getBuildNumber().hashCode()) + Math.abs(appVersion.getCommit().hashCode()));
    }

}