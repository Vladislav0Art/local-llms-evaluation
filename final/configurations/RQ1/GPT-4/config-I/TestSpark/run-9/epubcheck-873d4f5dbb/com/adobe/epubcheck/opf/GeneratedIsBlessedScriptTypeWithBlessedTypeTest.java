package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.url.URLFragment;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Set;

public class GeneratedIsBlessedScriptTypeWithBlessedTypeTest {

    @Test
    public void isBlessedScriptTypeWithBlessedTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}