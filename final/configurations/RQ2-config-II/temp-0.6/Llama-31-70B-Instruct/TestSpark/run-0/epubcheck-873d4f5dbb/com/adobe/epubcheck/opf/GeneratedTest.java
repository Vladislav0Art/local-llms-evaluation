package com.adobe.epubcheck.opf;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private OPFChecker30 opfChecker;

    @Mock
    private ValidationContext validationContext;

    @Before
    public void setUp() {
        opfChecker = new OPFChecker30(validationContext);
    }

    @Test
    public void initHandlerTest() {
        opfChecker.initHandler();

        // add verification here
    }

    @Test
    public void checkPackageTest() {
        boolean result = opfChecker.checkPackage();

        // add verification here
    }

    @Test
    public void checkContentTest() {
        boolean result = opfChecker.checkContent();

        // add verification here
    }

    @Test
    public void checkItemTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler opfHandler = mock(OPFHandler.class);

        opfChecker.checkItem(item, opfHandler);

        // add verification here
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem item = mock(OPFItem.class);

        opfChecker.checkItemAfterResourceValidation(item);

        // add verification here
    }

    @Test
    public void checkSpineItemTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler opfHandler = mock(OPFHandler.class);

        opfChecker.checkSpineItem(item, opfHandler);

        // add verification here
    }

}