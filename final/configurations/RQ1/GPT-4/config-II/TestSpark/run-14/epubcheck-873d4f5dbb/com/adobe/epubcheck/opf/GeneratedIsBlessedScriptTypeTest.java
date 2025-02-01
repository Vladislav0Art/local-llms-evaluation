package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.DocumentValidator;
import com.google.common.base.Optional;
import io.mola.galimatias.URL;

public class GeneratedIsBlessedScriptTypeTest {

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        assertFalse(OPFChecker30.isBlessedScriptType("text/php"));
    }

}