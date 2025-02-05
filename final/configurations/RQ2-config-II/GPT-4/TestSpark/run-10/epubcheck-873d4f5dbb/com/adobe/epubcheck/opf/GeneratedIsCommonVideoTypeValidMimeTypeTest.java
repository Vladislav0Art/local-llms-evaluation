package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsCommonVideoTypeValidMimeTypeTest {

    @Test
    public void isCommonVideoTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isCommonVideoType("video/x-flv"), is(true));
    }

}