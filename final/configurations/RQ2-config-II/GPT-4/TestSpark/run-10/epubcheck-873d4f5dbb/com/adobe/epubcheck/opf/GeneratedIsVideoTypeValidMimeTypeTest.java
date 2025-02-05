package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsVideoTypeValidMimeTypeTest {

    @Test
    public void isVideoTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isVideoType("video/mp4"), is(true));
    }

}