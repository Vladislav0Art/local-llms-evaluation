package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;

public class GeneratedCheckItemMimeTypeIsNullTest {

    @Test
    public void checkItemMimeTypeIsNullTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler handler = mock(OPFHandler.class);

        when(item.getMimeType()).thenReturn(null);
        OPFChecker30 opfChecker = new OPFChecker30();
        opfChecker.checkItem(item, handler);
        Mockito.verify(item, times(1)).getMimeType();
    }

}