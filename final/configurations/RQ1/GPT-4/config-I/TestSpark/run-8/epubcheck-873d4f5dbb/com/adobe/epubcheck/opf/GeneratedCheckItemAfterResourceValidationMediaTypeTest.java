package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedCheckItemAfterResourceValidationMediaTypeTest {

    @Test
    public void checkItemAfterResourceValidationMediaTypeTest() {
        OPFChecker30 checker30 = mock(OPFChecker30.class);
        OPFItem itemMock = mock(OPFItem.class);

        checker30.checkItemAfterResourceValidation(itemMock);

        verify(itemMock, times(1)).getMimeType();
    }

}