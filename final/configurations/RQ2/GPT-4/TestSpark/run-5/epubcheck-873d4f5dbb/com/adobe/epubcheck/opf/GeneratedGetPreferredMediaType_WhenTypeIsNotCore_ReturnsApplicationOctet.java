package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaType_WhenTypeIsNotCore_ReturnsApplicationOctet {

    @Test
    public void getPreferredMediaType_WhenTypeIsNotCore_ReturnsApplicationOctet() {
        String notCoreType = "not/core";
        String expected = "application/octet-stream";
        String actual = OPFChecker30.getPreferredMediaType(notCoreType, "abc.css");
        assertEquals(expected, actual);
    }

}