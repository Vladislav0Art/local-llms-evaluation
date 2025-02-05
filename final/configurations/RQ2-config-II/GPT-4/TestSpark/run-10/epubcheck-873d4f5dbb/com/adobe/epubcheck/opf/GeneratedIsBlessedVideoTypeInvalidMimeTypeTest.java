package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedVideoTypeInvalidMimeTypeTest {

    @Test
    public void isBlessedVideoTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedVideoType("video/xyz"), is(false));
    }

}