package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedGetPreferredMediaType_NoExceptions Test {

    @Test
    public void getPreferredMediaType_NoExceptions

    Test() {
        String type = "video";
        String path = "/path/to/video";
        String preferredMedia = OPFChecker30.getPreferredMediaType(type, path);
    }

}