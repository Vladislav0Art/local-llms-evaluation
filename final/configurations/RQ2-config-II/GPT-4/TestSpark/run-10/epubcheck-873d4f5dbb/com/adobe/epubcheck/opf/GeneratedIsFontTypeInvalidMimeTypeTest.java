package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsFontTypeInvalidMimeTypeTest {

    @Test
    public void isFontTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isFontType("font/xyz"), is(false));
    }

}