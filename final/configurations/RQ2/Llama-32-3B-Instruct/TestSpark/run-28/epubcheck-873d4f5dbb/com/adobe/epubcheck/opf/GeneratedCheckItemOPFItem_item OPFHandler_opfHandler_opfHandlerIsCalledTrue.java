package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemOPFItem_item OPFHandler_opfHandler_opfHandlerIsCalledTrue {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler handler;

    public void testInitHandler() {
        when(handler.init()).thenReturn(true);
        assertDoesNotThrow(OPFChecker30::initHandler);
    }

    @Test
    public void checkItemOPFItem_item

    OPFHandler_opfHandler_opfHandlerIsCalledTrue() {
        when(handler.opfHandlerIsCalled()).thenReturn(true);
        OPFChecker30.checkItem(Mockito.mock(OPFItem.class), handler);
        assertTrue(handler.opfHandlerHasBeenCalled());
    }

}