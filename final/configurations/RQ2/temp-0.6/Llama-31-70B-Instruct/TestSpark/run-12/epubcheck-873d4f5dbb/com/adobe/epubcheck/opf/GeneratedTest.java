package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private OPFChecker30 opfChecker30;

    @Test
    public void initHandlerTest() {
        opfChecker30.initHandler();
        Assert.assertTrue(opfChecker30.checkPackage());
        Assert.assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void checkPackageTest() {
        when(opfChecker30.checkPackage()).thenReturn(true);
        Assert.assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void checkContentTest() {
        when(opfChecker30.checkContent()).thenReturn(true);
        Assert.assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void checkItemTest() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        opfChecker30.checkItem(item, opfHandler);
        Assert.assertTrue(opfChecker30.checkItemAfterResourceValidation(item));
    }

    @Test
    public void checkSpineItemTest() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        opfChecker30.checkSpineItem(item, opfHandler);
    }

}