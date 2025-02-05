package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedFontTypeValidMimeTypeTest {

    @Test
    public void isBlessedFontTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedFontType("font/otf"), is(true));
    }

}