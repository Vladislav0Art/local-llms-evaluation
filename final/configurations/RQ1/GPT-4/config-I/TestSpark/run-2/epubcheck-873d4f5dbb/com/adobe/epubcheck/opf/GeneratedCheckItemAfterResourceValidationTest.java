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

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        ValidationContext context = mock(ValidationContext.class);
        CheckingReport report = mock(CheckingReport.class);
        when(context.getReport()).thenReturn(report);
        when(context.hasReferences()).thenReturn(true);
        when(context.getFeatureReport()).thenReturn(mock(FeatureReport.class));

        URL url = mock(URL.class);

        OPFItem opfItem = mock(OPFItem.class);
        when(opfItem.getMimeType()).thenReturn("audio/mpeg");
        when(opfItem.getURL()).thenReturn(url);

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItemAfterResourceValidation(opfItem);
        verify(report, never()).message(MessageId.RSC_006, opfItem.getLocation().toString(), opfItem.getPath());
    }

}