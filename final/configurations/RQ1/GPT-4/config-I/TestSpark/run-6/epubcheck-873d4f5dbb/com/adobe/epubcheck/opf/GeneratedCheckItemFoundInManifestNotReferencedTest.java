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

public class GeneratedCheckItemFoundInManifestNotReferencedTest {

    @Test
    public void checkItemFoundInManifestNotReferencedTest() throws MalformedURLException {
        ValidationContext context = new ValidationContext(EpubProfile, "SampleFile", new URL("sampleData"), new URL("sampleContent"), null, null, null, null, EPUBVersion.VERSION_3);
        Report report = Mockito.mock(Report.class);
        context.report = report;

        OPFItem item = new OPFItem("sampleItemId", "sampleHref", "sampleMediaType", false, false, false, "sampleFallbackItemId", "sampleFallbackStyle", "sampleMediaOverlayId", new URL("sampleURL"));

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItemAfterResourceValidation(item);

        Mockito.verify(report).message(MessageId.OPF_097, item.getLocation(), item.getPath());
    }

}