package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetCommitTest_ValidAmiName_ReturnsCommit {

    @Test
    public void getCommitTest_ValidAmiName_ReturnsCommit() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertNotNull("Expected a commit", appVersion.getCommit());
    }

}