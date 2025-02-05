package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeValidScenarioTest {

    @Test
    public void getPreferredMediaTypeValidScenarioTest() {
        assertEquals("image/png", OPFChecker30.getPreferredMediaType("image/png", "icon.png"));
    }

}