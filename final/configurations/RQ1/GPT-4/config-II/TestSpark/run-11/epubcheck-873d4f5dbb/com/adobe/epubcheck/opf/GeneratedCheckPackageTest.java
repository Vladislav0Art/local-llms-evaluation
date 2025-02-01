package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        assertFalse(checker.checkPackage());
    }

}