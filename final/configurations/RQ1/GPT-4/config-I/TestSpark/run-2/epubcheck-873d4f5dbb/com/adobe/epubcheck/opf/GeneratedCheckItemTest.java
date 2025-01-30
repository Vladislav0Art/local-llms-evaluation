package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.ValidationContext;
import org.junit.Assert;
import com.adobe.epubcheck.util.CheckingReport;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.messages.MessageId;
import io.mola.galimatias.URL;
import com.adobe.epubcheck.api.FeatureReport;

import java.util.Collections;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        CheckingReport report = mock(CheckingReport.class);
        when(context.getReport()).thenReturn(report);

        OPFItem item = mock(OPFItem.class);
        when(item.getMimeType()).thenReturn("abc/def");
        when(item.getPath()).thenReturn("META-INF/item.xml");

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(item, null);
        verify(report, times(1)).message(MessageId.PKG_025, new Object[]{item.getLocation().toString()});
    }

}