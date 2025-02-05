package com.adobe.epubcheck.opf;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeneratedIsBlessedScriptTypeValidMimeTypeTest {

    @Test
    public void isBlessedScriptTypeValidMimeTypeTest() {
        assertThat(OPFChecker30.isBlessedScriptType("application/javascript"), is(true));
    }

}