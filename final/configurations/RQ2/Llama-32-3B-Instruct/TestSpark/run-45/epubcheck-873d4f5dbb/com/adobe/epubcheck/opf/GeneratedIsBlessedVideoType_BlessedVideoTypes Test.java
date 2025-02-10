package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsBlessedVideoType_BlessedVideoTypes Test {

    @Test
    public void isBlessedVideoType_BlessedVideoTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedVideoType("blessed video"));
        assertFalse(OPFChecker30.isBlessedVideoType("video"));
    }

}