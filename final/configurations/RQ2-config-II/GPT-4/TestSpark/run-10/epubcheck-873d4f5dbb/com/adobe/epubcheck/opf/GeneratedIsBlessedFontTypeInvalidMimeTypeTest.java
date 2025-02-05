package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedFontTypeInvalidMimeTypeTest {

    @Test
    public void isBlessedFontTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedFontType("font/xyz"), is(false));
    }

}