package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsBlessedScriptTypeInvalidTypeTest {

    @Test
    public void isBlessedScriptTypeInvalidTypeTest() {
        String type = "invalid/type";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertFalse(result);
    }

}