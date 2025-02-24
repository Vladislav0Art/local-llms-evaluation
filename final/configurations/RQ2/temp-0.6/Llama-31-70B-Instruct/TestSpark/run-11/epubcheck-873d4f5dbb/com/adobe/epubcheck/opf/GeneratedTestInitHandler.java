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
public class GeneratedTestInitHandler {

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

}