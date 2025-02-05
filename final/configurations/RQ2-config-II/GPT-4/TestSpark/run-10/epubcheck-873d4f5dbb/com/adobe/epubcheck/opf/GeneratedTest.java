package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isAudioTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isAudioType("audio/mp3"), is(true));
    }

    @Test
    public void isAudioTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isAudioType("audio/nonexistent"), is(false));
    }

    @Test
    public void isBlessedAudioTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedAudioType("audio/mpeg"), is(true));
    }

    @Test
    public void isBlessedAudioTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedAudioType("audio/wma"), is(false));
    }

    @Test
    public void isVideoTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isVideoType("video/mp4"), is(true));
    }

    @Test
    public void isVideoTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isVideoType("video/xyz"), is(false));
    }

    @Test
    public void isBlessedVideoTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedVideoType("video/mp4"), is(true));
    }

    @Test
    public void isBlessedVideoTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedVideoType("video/xyz"), is(false));
    }

    @Test
    public void isCommonVideoTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isCommonVideoType("video/x-flv"), is(true));
    }

    @Test
    public void isCommonVideoTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isCommonVideoType("video/xyz"), is(false));
    }

    @Test
    public void isFontTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isFontType("font/otf"), is(true));
    }

    @Test
    public void isFontTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isFontType("font/xyz"), is(false));
    }

    @Test
    public void isBlessedFontTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedFontType("font/otf"), is(true));
    }

    @Test
    public void isBlessedFontTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedFontType("font/xyz"), is(false));
    }

    @Test
    public void isBlessedScriptTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedScriptType("application/javascript"), is(true));
    }

    @Test
    public void isBlessedScriptTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedScriptType("application/perl"), is(false));
    }

    @Test
    public void isCoreMediaTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isCoreMediaType("application/javascript"), is(true));
    }

    @Test
    public void isCoreMediaTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isCoreMediaType("application/xyz"), is(false));
    }

    @Test
    public void getPreferredMediaTypeValidMimeTypeTest() {
        String type = "text/html";
        String path = "path/to/resource.html";
        assertThat(OPFChecker30.getPreferredMediaType(type, path), is("application/xhtml+xml"));
    }

    @Test
    public void getPreferredMediaTypeInvalidMimeTypeTest() {
        String type = "application/invalid";
        String path = "path/to/resource.invalid";
        assertThat(OPFChecker30.getPreferredMediaType(type, path), is("text/plain"));
    }

}