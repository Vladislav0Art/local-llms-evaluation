package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackageTest {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkPackageTest() {
        assertTrue(opfChecker30.checkPackage());
    }

}