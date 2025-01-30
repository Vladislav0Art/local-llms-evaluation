package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion validAppVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.g7f0cae8/WE-WAPP-subscriberha_v2/46");
        assertEquals("g7f0cae8", validAppVersion.getChangelist());
    }

}