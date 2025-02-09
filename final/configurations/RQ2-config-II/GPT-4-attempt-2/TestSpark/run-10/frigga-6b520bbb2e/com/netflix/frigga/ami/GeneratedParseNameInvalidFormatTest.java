package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidFormatTest {

    @Test
    public void parseNameInvalidFormatTest() {
        AppVersion.parseName("invalidAmiName");
    }

}