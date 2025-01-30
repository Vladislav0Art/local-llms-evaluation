package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.Report;

public class GeneratedCheckItemMimeTypeIsEmptyTest {

    @Test
    public void checkItemMimeTypeIsEmptyTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler handler = mock(OPFHandler.class);
        Report report = mock(Report.class);

        when(item.getMimeType()).thenReturn("");
        OPFChecker30 opfChecker = new OPFChecker30(new ValidationContext.Builder().report(report).build());
        opfChecker.checkItem(item, handler);
        Mockito.verify(item, times(1)).getMimeType();
    }

}