package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.util.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext context = new ValidationContext.Builder()
                .report(Mockito.mock(Report.class))
                .build();
        OPFChecker30 checker = new OPFChecker30(context);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        OPFItem item = Mockito.mock(OPFItem.class);

        Mockito.when(item.hasDataURL()).thenReturn(false);
        Mockito.when(item.getPath()).thenReturn("META-INF/");
        Mockito.when(item.getMimeType()).thenReturn("application/xhtml+xml");
        Mockito.when(item.getMediaOverlay()).thenReturn("overlay");
        Mockito.when(opfHandler.getItemById(Mockito.anyString())).thenReturn(Optional.of(item));
        Mockito.when(item.getLocation()).thenReturn(EPUBLocation.create("abc/def", 1, 1));

        checker.checkItem(item, opfHandler);
    }

}