package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsBlessedVideoType_validType_ReturnsTrue {

    @Test
    public void isBlessedVideoType_validType_ReturnsTrue() {
        String type = "blessed video/mp4";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertTrue(result);
    }

}