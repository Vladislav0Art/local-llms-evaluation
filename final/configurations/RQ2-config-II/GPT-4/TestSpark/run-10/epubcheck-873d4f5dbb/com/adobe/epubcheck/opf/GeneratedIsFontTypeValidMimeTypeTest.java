package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsFontTypeValidMimeTypeTest {

    @Test
    public void isFontTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isFontType("font/otf"), is(true));
    }

}