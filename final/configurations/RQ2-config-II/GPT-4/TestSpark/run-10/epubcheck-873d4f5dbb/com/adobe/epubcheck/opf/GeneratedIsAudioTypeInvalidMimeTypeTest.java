package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsAudioTypeInvalidMimeTypeTest {

    @Test
    public void isAudioTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isAudioType("audio/nonexistent"), is(false));
    }

}