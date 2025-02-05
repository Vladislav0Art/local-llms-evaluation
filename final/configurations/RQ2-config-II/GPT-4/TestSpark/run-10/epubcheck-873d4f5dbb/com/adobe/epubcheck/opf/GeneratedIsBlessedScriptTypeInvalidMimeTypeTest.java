package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedScriptTypeInvalidMimeTypeTest {

    @Test
    public void isBlessedScriptTypeInvalidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedScriptType("application/perl"), is(false));
    }

}