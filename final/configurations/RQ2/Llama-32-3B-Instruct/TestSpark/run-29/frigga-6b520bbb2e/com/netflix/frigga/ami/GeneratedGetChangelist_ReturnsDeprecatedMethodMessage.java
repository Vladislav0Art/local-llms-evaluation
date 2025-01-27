package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetChangelist_ReturnsDeprecatedMethodMessage {

    @Test
    public void getChangelist_ReturnsDeprecatedMethodMessage() {
        assertThrows(NullPointerException.class, () -> AppVersion.getChangelist());
    }

}