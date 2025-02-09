package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedParseNameInvalidInputTest {

    @Test
    public void parseNameInvalidInputTest() {
        AppVersion.parseName("Invalid Input");
    }

}