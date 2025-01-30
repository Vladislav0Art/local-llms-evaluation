package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 opfChecker = new OPFChecker30();
        opfChecker.initHandler();
        assertNotNull(opfChecker);
    }

}