package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        OPFChecker30 opfChecker = new OPFChecker30();
        assertFalse(opfChecker.checkPackage());
    }

}