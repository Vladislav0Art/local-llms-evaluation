package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetChangelistTest_validCommit {

    @Test
    public void getChangelistTest_validCommit() {
        String amiName = "subscriberha-1.0.0-586499.gcommit";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertEquals("commit", appVersion.getChangelist());
    }

}