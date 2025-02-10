package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedGetPreferredMediaType_WithExceptions Test {

    @Test
    public void getPreferredMediaType_WithExceptions

    Test() {
        String type = "video";
        String path = "/invalid/path";
        OPFChecker30.getPreferredMediaType(type, path);
    }

}