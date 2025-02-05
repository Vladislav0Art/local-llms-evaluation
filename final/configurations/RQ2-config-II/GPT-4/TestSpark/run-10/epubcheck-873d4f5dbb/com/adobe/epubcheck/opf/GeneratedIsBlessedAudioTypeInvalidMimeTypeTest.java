package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeInvalidMimeTypeTest {

    @Test
    public void isBlessedAudioTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedAudioType("audio/wma"), is(false));
    }

}