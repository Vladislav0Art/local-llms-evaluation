package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackage_ReturnsCorrectCommitHash {

    @Test
    public void getPackage_ReturnsCorrectCommitHash() {
        String commitHash = "6b520bbb2e";
        AppVersion appVersion = new AppVersion("", "build-job-name", commitHash);
        assertEquals(commitHash, appVersion.getCommitHash());
    }

}