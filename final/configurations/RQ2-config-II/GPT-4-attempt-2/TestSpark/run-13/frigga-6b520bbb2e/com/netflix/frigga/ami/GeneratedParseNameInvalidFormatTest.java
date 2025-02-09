package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNameInvalidFormatTest {

    @Test
    public void parseNameInvalidFormatTest() {
        String invalidAmiName = "invalid_name";
        AppVersion.parseName(invalidAmiName);
    }

}