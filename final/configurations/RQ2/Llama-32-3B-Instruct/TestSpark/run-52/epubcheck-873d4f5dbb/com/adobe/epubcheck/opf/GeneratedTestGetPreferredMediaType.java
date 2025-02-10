package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.InjectMocks;

public class GeneratedTestGetPreferredMediaType {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

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