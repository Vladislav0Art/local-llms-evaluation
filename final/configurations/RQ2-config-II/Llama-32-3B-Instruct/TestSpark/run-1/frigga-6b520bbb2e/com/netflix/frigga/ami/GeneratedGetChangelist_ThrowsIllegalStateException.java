package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ThrowsIllegalStateException {

    @Test
    public void getChangelist_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> AppVersion.parseName("ami-1234567890").getChangelist());
    }

}