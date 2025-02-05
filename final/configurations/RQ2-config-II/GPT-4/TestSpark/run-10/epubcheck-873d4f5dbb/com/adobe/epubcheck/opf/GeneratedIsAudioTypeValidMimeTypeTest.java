package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsAudioTypeValidMimeTypeTest {

    @Test
    public void isAudioTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isAudioType("audio/mp3"), is(true));
    }

}