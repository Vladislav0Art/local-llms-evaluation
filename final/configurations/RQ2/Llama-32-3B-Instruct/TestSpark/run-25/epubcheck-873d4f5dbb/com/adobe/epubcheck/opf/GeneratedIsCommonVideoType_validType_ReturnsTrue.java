package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsCommonVideoType_validType_ReturnsTrue {

    @Test
    public void isCommonVideoType_validType_ReturnsTrue() {
        String type = "video/x-flv";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertTrue(result);
    }

}