package com.netflix.frigga.ami;

import com.netflix.frigga.AppVersion;

public class GeneratedTestParseName {

    @BeforeEach
    public void setup() {
        AppVersion.parseName("my-ami-name");
    }

    @Test
    public void testParseName() {
        String actualName = AppVersion.parseName("1234567890abcdef");
        System.out.println(actualName);
    }

}