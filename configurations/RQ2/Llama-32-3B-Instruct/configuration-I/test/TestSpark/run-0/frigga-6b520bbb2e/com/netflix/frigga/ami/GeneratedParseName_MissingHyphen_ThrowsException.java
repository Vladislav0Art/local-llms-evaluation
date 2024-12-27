package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedParseName_MissingHyphen_ThrowsException {

    @Test
    public void parseName_MissingHyphen_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.parseName("1234567890"));
    }

}