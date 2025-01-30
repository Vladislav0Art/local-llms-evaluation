package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.Report;

public class GeneratedCheckSpineItemDataUrlTest {

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