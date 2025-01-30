package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTestInvalidAmiName {

    @Test
    public void parseNameTestInvalidAmiName() {
        AppVersion result = AppVersion.parseName("invalid-ami-name");
        assertNull(result);
    }

}