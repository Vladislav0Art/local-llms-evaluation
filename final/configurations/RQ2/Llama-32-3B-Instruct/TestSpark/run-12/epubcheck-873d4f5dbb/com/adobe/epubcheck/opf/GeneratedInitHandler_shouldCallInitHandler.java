package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitHandler_shouldCallInitHandler {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void initHandler_shouldCallInitHandler() {
        // when
        doNothing().when(opfHandler).initHandler();

        // then
        new OPFChecker30(context).initHandler();
    }

}