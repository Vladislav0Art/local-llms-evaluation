package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.api.ValidationContext;
import io.mola.galimatias.URL;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCheckItemDataURITest {

    @Test
    public void checkItemDataURITest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFItem item = mock(OPFItem.class);
        OPFHandler30 handler = mock(OPFHandler30.class);
        when(item.hasDataURL()).thenReturn(true);

        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, handler);

        verify(context).report.message(MessageId.RSC_029, item.getLocation());
    }

}