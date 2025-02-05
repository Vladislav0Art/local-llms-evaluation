package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsCoreMediaTypeValidMimeTypeTest {

    @Test
    public void isCoreMediaTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isCoreMediaType("application/javascript"), is(true));
    }

}