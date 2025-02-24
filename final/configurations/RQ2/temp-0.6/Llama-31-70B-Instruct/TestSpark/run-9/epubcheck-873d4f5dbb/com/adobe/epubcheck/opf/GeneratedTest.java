package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private OPFChecker30 opfChecker30;

    @Before
    public void setUp() {
        opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
    }

    @Test
    public void checkPackageTest() {
        boolean result = opfChecker30.checkPackage();
        assertTrue(result);
    }

    @Test
    public void checkContentTest() {
        boolean result = opfChecker30.checkContent();
        assertTrue(result);
    }

    @Test
    public void checkItemTest() {
        boolean result = opfChecker30.checkItem(Mockito.mock(OPFItem.class), Mockito.mock(OPFHandler.class));
        assertTrue(result);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        opfChecker30.checkItemAfterResourceValidation(Mockito.mock(OPFItem.class));
    }

    @Test
    public void checkSpineItemTest() {
        boolean result = opfChecker30.checkSpineItem(Mockito.mock(OPFItem.class), Mockito.mock(OPFHandler.class));
        assertTrue(result);
    }

    @Test
    public void isAudioTypeTest() {
        boolean result = OPFChecker30.isAudioType("audio/mpeg");
        assertTrue(result);
    }

    @Test
    public void isBlessedAudioTypeTest() {
        boolean result = OPFChecker30.isBlessedAudioType("audio/mpeg");
        assertTrue(result);
    }

}