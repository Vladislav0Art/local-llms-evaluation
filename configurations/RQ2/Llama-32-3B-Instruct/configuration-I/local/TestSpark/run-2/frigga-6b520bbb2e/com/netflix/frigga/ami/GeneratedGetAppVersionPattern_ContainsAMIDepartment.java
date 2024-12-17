package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedGetAppVersionPattern_ContainsAMIDepartment {

    @Test
    public void getAppVersionPattern_ContainsAMIDepartment() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("ami-12345678901").find());
    }

}