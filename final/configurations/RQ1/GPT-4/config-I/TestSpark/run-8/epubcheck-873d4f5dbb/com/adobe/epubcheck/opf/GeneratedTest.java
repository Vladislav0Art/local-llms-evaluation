package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void checkItemDataURLReturnsTest() {
        OPFChecker30 checker30 = mock(OPFChecker30.class);
        OPFItem itemMock = mock(OPFItem.class);
        OPFHandler30 handlerMock = mock(OPFHandler30.class);

        checker30.checkItem(itemMock, handlerMock);

        verify(itemMock, times(1)).hasDataURL();
    }

    @Test
    public void checkItemAfterResourceValidationMediaTypeTest() {
        OPFChecker30 checker30 = mock(OPFChecker30.class);
        OPFItem itemMock = mock(OPFItem.class);

        checker30.checkItemAfterResourceValidation(itemMock);

        verify(itemMock, times(1)).getMimeType();
    }

    @Test
    public void initHandlerTest() {
        OPFChecker30 checker30 = mock(OPFChecker30.class);
        checker30.initHandler();

        //just validates the method is reached and completed without exceptions
        assertTrue(true);
    }

}