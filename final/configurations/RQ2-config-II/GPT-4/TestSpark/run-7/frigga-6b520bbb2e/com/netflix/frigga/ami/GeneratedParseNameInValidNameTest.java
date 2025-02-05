package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInValidNameTest {

    @Test
    public void parseNameInValidNameTest() {
        String invalidAmiName = "invalid-ami-name";
        AppVersion.parseName(invalidAmiName);
    }

}