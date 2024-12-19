package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestGetCommit {

    @Test
    public void [AppVersion][Scenario]TestGetCommit() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String commit = appVersion.getCommit();
        assertEquals("commit", commit);
    }

}