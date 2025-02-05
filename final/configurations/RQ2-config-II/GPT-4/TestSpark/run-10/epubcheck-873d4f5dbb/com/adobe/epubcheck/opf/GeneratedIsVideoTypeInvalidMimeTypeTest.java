package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsVideoTypeInvalidMimeTypeTest {

    @Test
    public void isVideoTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isVideoType("video/xyz"), is(false));
    }

}