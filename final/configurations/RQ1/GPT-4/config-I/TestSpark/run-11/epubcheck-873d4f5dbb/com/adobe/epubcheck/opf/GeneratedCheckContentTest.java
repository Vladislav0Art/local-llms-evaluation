package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        OPFChecker30 opfChecker = new OPFChecker30();
        assertTrue(opfChecker.checkContent());
    }

}