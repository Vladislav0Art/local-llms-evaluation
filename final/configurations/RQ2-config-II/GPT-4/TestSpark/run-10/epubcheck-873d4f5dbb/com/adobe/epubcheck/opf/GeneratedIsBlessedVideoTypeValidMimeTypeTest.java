package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedVideoTypeValidMimeTypeTest {

    @Test
    public void isBlessedVideoTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedVideoType("video/mp4"), is(true));
    }

}