package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsCoreMediaTypeInvalidMimeTypeTest {

    @Test
    public void isCoreMediaTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isCoreMediaType("application/xyz"), is(false));
    }

}