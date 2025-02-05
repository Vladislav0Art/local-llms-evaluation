package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeInvalidScenarioTest {

    @Test
    public void getPreferredMediaTypeInvalidScenarioTest() {
        assertNotEquals("text/xml", OPFChecker30.getPreferredMediaType("image/png", "icon.png"));
    }

}