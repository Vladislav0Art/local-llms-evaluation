package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsVideoType_validType_ReturnsTrue {

    @Test
    public void isVideoType_validType_ReturnsTrue() {
        String type = "video/mp4";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);
    }

}