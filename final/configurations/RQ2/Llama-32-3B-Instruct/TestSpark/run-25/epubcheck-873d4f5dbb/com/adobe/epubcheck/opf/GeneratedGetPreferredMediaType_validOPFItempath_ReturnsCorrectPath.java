package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedGetPreferredMediaType_validOPFItempath_ReturnsCorrectPath {

    @Test
    public void getPreferredMediaType_validOPFItempath_ReturnsCorrectPath() {
        String type = "text/html";
        String path = "/index.html";
        String preferredMedia = OPFChecker30.getPreferredMediaType(type, path);
        assertEquals(path, preferredMedia);
    }

}