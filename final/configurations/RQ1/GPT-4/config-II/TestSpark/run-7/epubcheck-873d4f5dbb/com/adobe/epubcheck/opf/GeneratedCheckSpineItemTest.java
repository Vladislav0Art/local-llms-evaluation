package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.util.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;

public class GeneratedCheckSpineItemTest {

    @Test
    public void checkSpineItemTest() {
        ValidationContext context = new ValidationContext.Builder()
                .report(Mockito.mock(Report.class))
                .build();
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = Mockito.mock(OPFItem.class);
        Mockito.when(item.hasDataURL()).thenReturn(false);
        Mockito.when(item.getMimeType()).thenReturn("application/xhtml+xml");

        checker.checkSpineItem(item, Mockito.mock(OPFHandler.class));
    }

}