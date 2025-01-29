package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTest {

    @Test
    public void testInitHandler() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30();

        // Act
        assertTrue(checker.initHandler() != null);
    }

    @Test
    public void testCheckPackage() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        assertTrue(checker.checkPackage());
        assertFalse(checker.checkPackage());
    }

    @Test
    public void testCheckContent() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        // Act
        assertFalse(checker.checkContent());
        assertTrue(checker.checkContent());
    }

    @Test
    public void testCheckItem() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        try {
            checker.checkItem(null, null);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        try {
            checker.checkItemAfterResourceValidation(null);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testCheckSpineItem() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());

        try {
            checker.checkSpineItem(null, null);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testIsAudioType() {
        assertTrue(OPFChecker30.isAudioType("audio"));
        assertFalse(OPFChecker30.isAudioType("video"));
    }

    @Test
    public void testIsBlessedAudioType() {
        assertTrue(OPFChecker30.isBlessedAudioType("bible"));
        assertFalse(OPFChecker30.isBlessedAudioType("video"));
    }

    @Test
    public void testIsVideoType() {
        assertTrue(OPFChecker30.isVideoType("video"));
        assertFalse(OPFChecker30.isVideoType("audio"));
    }

    @Test
    public void testIsBlessedVideoType() {
        assertTrue(OPFChecker30.isBlessedVideoType("bible"));
        assertFalse(OPFChecker30.isBlessedVideoType("video"));
    }

    @Test
    public void testIsCommonVideoType() {
        assertTrue(OPFChecker30.isCommonVideoType("video"));
        assertTrue(OPFChecker30.isCommonVideoType("audio"));
    }

    @Test
    public void testIsFontType() {
        assertTrue(OPFChecker30.isFontType("font"));
        assertFalse(OPFChecker30.isFontType("image"));
    }

    @Test
    public void testIsBlessedFontType() {
        assertTrue(OPFChecker30.isBlessedFontType("bible"));
        assertTrue(OPFChecker30.isBlessedFontType("font"));
    }

    @Test
    public void testIsBlessedScriptType() {
        assertTrue(OPFChecker30.isBlessedScriptType("script"));
        assertFalse(OPFChecker30.isBlessedScriptType("audio"));
    }

    @Test
    public void testIsCoreMediaType() {
        assertTrue(OPFChecker30.isCoreMediaType("video", "path1"));
        assertFalse(OPFChecker30.isCoreMediaType("application/image", "path2"));
    }

}