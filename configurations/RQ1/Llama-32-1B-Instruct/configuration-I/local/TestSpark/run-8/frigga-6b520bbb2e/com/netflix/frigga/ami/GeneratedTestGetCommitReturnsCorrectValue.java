package com.netflix.frigga.ami;

import static org.junit.Assert.*;

public class GeneratedTestGetCommitReturnsCorrectValue {

    @Test
    public void testGetCommitReturnsCorrectValue() {
        String expected = " subscriberha-h150";
        AppVersion appVersion = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        assertEquals(expected, appVersion.getCommit());
    }

}