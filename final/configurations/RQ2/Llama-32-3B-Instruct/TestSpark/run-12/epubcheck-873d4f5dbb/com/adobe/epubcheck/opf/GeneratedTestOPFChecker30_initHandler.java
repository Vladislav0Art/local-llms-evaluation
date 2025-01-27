package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOPFChecker30_initHandler {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void testOPFChecker30_initHandler() {
        // given
        doNothing().when(opfHandler).initHandler();

        // when
        new OPFChecker30(context).initHandler();

        // then
        Mockito.verify(opfHandler).initHandler();
    }

}