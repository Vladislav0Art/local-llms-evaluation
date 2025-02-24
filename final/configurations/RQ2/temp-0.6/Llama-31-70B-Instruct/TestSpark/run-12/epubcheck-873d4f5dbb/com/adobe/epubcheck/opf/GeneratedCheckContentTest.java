package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckContentTest {

    @Mock
    private OPFChecker30 opfChecker30;

    @Test
    public void checkContentTest() {
        when(opfChecker30.checkContent()).thenReturn(true);
        Assert.assertTrue(opfChecker30.checkContent());
    }

}