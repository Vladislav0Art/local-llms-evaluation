package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsBlessedScriptTypeValidTypeTest {

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        String type = "text/javascript";
        boolean result = OPFChecker30.isBlessedScriptType(type);
        assertTrue(result);
    }

}