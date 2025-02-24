package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckContent {

    @Mock
    private ValidationContext context;

    @Test
    public void testCheckContent() {
        OPFChecker30 testChecker = new OPFChecker30(context);
        doReturn(false).when(context).hasFatalErrors();
        boolean actualResult = testChecker.checkContent();
        verify(context).hasFatalErrors();
        assertEquals(false, actualResult);
    }

}