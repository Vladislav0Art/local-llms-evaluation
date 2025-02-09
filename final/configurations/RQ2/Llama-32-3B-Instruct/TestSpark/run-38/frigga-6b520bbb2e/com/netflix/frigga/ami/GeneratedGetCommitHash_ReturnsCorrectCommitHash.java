package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommitHash_ReturnsCorrectCommitHash {

    @Test
    public void getCommitHash_ReturnsCorrectCommitHash() {
        String commitHash = "commit-hash";
        AppVersion appVersion = new AppVersion("", "", commitHash);
        assertEquals(commitHash, appVersion.getCommitHash());
    }
}

class AppVersion {
    private String package_;
    private String buildJobName;
    private String commitHash;

    public static AppVersion parseName(String name) {
        // implement logic to parse name and return an instance of AppVersion
        return new AppVersion();
    }

    public String getPackage() {
        return package_;
    }

    public void setPackage(String package_) {
        this.package_ = package_;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

}