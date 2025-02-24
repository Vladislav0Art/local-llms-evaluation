package com.adobe.epubcheck.opf;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackageTest {

    private OPFChecker30 opfChecker;

    @Mock
    private ValidationContext validationContext;

    @Before
    public void setUp() {
        opfChecker = new OPFChecker30(validationContext);
    }

    @Test
    public void checkPackageTest() {
        boolean result = opfChecker.checkPackage();

        // add verification here
    }

}