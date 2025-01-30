package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedCheckItemStartsWithMetaInfTest {

    @Test
    public void checkItemStartsWithMetaInfTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        OPFItem opfItem = mock(OPFItem.class);
        Report report = mock(Report.class);
        when(context.report).thenReturn(report);
        when(opfItem.getLocation()).thenReturn(null);
        when(opfItem.hasDataURL()).thenReturn(false);
        when(opfItem.getPath()).thenReturn("META-INF/test");

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(opfItem, opfHandler);
        verify(report).message(eq(MessageId.PKG_025), any());
    }

}