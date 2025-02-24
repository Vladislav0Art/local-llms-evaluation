package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ValidationContext context;
    @Mock
    private OPFHandler opfHandler;
    @Mock
    private OPFItem item;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void testInitHandler() {
        opfChecker30.initHandler();
        assertTrue(true);
    }

    @Test
    public void testCheckPackage() {
        when(opfChecker30.checkPackage()).thenReturn(true);
        assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void testCheckContent() {
        when(opfChecker30.checkContent()).thenReturn(true);
        assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void testCheckItem() {
        when(opfChecker30.checkItem(item, opfHandler)).thenReturn(true);
        assertTrue(opfChecker30.checkItem(item, opfHandler));
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        when(opfChecker30.checkItemAfterResourceValidation(item)).thenReturn(true);
        assertTrue(opfChecker30.checkItemAfterResourceValidation(item));
    }

}