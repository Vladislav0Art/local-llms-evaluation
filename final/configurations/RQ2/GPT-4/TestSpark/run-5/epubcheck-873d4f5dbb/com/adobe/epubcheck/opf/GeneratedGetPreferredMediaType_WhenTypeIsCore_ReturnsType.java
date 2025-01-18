package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaType_WhenTypeIsCore_ReturnsType {

    @Test
    public void getPreferredMediaType_WhenTypeIsCore_ReturnsType() {
        String expected = "text/css";
        String actual = OPFChecker30.getPreferredMediaType(expected, "abc.css");
        assertEquals(expected, actual);
    }

}