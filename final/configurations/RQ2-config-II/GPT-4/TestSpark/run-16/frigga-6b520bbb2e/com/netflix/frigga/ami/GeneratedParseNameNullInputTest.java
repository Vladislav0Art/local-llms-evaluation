package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNameNullInputTest {

    @Test
    public void parseNameNullInputTest() {
        assertNull(AppVersion.parseName(null));
    }

}