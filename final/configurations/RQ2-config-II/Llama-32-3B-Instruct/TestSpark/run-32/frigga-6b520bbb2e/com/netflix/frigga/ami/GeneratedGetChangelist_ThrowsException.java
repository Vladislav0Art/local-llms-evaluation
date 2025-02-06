package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ThrowsException {

    @Test
    public void getChangelist_ThrowsException() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertThrows(UnsupportedOperationException.class, () -> version.getChangelist());
    }

}