package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.Report;

public class GeneratedTest {

    @Test
    public void checkItemDataUrlTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler handler = mock(OPFHandler.class);
        Report report = mock(Report.class);

        when(item.hasDataURL()).thenReturn(true);
        OPFChecker30 opfChecker = new OPFChecker30(new ValidationContext.Builder().report(report).build());
        opfChecker.checkItem(item, handler);
        Mockito.verify(item, times(1)).hasDataURL();
    }

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

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem item = mock(OPFItem.class);
        Report report = mock(Report.class);

        when(item.isRemote()).thenReturn(true);
        OPFChecker30 opfChecker = new OPFChecker30(new ValidationContext.Builder().report(report).build());
        opfChecker.checkItemAfterResourceValidation(item);
        Mockito.verify(item, times(1)).isRemote();
    }

    @Test
    public void checkSpineItemDataUrlTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler handler = mock(OPFHandler.class);
        Report report = mock(Report.class);

        when(item.hasDataURL()).thenReturn(true);
        OPFChecker30 opfChecker = new OPFChecker30(new ValidationContext.Builder().report(report).build());
        opfChecker.checkSpineItem(item, handler);
        Mockito.verify(item, times(1)).hasDataURL();
    }

}