package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.api.ValidationContext;
import io.mola.galimatias.URL;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCheckItemMetaInfoTest {

    @Test
    public void checkItemMetaInfoTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFItem item = mock(OPFItem.class);
        OPFHandler30 handler = mock(OPFHandler30.class);
        when(item.hasDataURL()).thenReturn(false);
        when(item.getPath()).thenReturn("META-INF/test");

        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, handler);

        verify(context).report.message(MessageId.PKG_025, item.getLocation());
    }

}