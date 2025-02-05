package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeValidMimeTypeTest {

    @Test
    public void isBlessedAudioTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedAudioType("audio/mpeg"), is(true));
    }

}