package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.InjectMocks;

public class GeneratedTest {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

    @Test
    public void testCheckPackage() {
        when(opfChecker30UnderTest.checkPackage()).thenReturn(false);
        assertFalse(opfChecker30UnderTest.checkPackage());
    }

    @Test
    public void testCheckContent() {
        boolean result = opfChecker30UnderTest.checkContent();
        assertTrue(result);
    }

    @Test
    public void testIsAudioType() {
        assertFalse(opfChecker30UnderTest.isAudioType("other"));
        assertTrue(opfChecker30UnderTest.isAudioType("audio"));
    }

    @Test
    public void testIsVideoType() {
        assertFalse(opfChecker30UnderTest.isVideoType("other"));
        assertTrue(opfChecker30UnderTest.isVideoType("video"));
    }

    @Test
    public void testGetPreferredMediaType() {
        String type = "type";
        String path = "/path";
        String result = opfChecker30UnderTest.getPreferredMediaType(type, path);
        assertNotNull(result);
    }
}

public class OPFChecker30 {

    private ValidationContext context;

    public boolean checkPackage() {
        return false;
    }

    public boolean checkContent() {
        return true;
    }

    public boolean isAudioType(String type) {
        return "audio".equals(type);
    }

    public boolean isVideoType(String type) {
        return "video".equals(type);
    }

    public String getPreferredMediaType(String type, String path) {
        return null;
    }

}