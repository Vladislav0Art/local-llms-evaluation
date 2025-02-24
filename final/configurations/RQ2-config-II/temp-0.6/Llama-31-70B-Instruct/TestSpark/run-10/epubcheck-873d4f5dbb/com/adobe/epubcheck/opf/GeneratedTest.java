package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void initHandlerTest() {
        opfChecker30.initHandler();
        assertTrue(true);
    }

    @Test
    public void checkPackageTest() {
        assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void checkContentTest() {
        assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void checkItemTest() {
        OPFHandler opfHandler = new OPFHandler(opfChecker30.context);
        OPFItem item = new OPFItem("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        opfChecker30.checkItem(item, opfHandler);
        assertTrue(true);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem item = new OPFItem("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        opfChecker30.checkItemAfterResourceValidation(item);
        assertTrue(true);
    }

}