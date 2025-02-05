package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeValidMimeTypeTest {

    @Test
    public void getPreferredMediaTypeValidMimeTypeTest() {
        String type = "text/html";
        String path = "path/to/resource.html";
        assertThat(OPFChecker30.getPreferredMediaType(type, path), is("application/xhtml+xml"));
    }

}