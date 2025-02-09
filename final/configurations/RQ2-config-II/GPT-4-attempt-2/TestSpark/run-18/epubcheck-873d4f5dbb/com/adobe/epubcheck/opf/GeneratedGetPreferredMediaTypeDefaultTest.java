package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeDefaultTest {

    @Test
    public void getPreferredMediaTypeDefaultTest() {
        assertEquals("application/unknown", OPFChecker30.getPreferredMediaType("application/unknown", "unknowntype.unknown"));
    }

}