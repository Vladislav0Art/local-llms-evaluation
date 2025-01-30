package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.core.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;
import io.mola.galimatias.URL;
import io.mola.galimatias.MalformedURLException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedCheckItemHavingDataURLTest {

    @Test
    public void checkItemHavingDataURLTest() throws MalformedURLException {
        ValidationContext context = new ValidationContext(EpubProfile, "SampleFile", new URL("sampleData"), new URL("sampleContent"), null, null, null, null, EPUBVersion.VERSION_3);
        OPFItem item = new OPFItem("sampleItemId", "sampleHref", "sampleMediaType", false, false, false, "sampleFallbackItemId", "sampleFallbackStyle", "sampleMediaOverlayId", new URL("sampleURL"));
        Report report = Mockito.mock(Report.class);
        context.report = report;

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(item, null);

        Mockito.verify(report).message(MessageId.RSC_029, item.getLocation());
    }

}