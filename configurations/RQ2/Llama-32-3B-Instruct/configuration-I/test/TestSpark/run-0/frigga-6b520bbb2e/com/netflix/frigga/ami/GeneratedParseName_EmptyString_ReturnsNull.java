package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedParseName_EmptyString_ReturnsNull {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

}