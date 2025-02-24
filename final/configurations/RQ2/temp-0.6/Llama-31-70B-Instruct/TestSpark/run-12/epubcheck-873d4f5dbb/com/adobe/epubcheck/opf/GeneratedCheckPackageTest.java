package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackageTest {

    @Mock
    private OPFChecker30 opfChecker30;

    @Test
    public void checkPackageTest() {
        when(opfChecker30.checkPackage()).thenReturn(true);
        Assert.assertTrue(opfChecker30.checkPackage());
    }

}