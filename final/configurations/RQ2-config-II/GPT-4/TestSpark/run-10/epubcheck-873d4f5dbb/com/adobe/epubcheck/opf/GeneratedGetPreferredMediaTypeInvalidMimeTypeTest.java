package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedGetPreferredMediaTypeInvalidMimeTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidMimeTypeTest() {
        String type = "application/invalid";
        String path = "path/to/resource.invalid";
        assertThat(OPFChecker30.getPreferredMediaType(type, path), is("text/plain"));
    }

}