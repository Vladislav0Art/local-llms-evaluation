package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.url.URLFragment;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.util.outWriter;
import com.google.common.base.Optional;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

import static org.mockito.Mockito.*;

public class GeneratedCheckSpineItemNoContentDocumentFallbackTest {

    @Test
    public void checkSpineItemNoContentDocumentFallbackTest() throws IOException {
        ValidationContext context = initContext();
        OPFChecker30 opfChecker = new OPFChecker30(context);
        OPFItem item = Mockito.mock(OPFItem.class);
        when(item.getMimeType()).thenReturn("non-blessed-type");
        when(item.hasFallback()).thenReturn(true);
        when(item.hasContentDocumentFallback()).thenReturn(false);
        when(item.hasDataURL()).thenReturn(false);

        OPFHandler handler = Mockito.mock(OPFHandler.class);
        opfChecker.checkSpineItem(item, handler);

        verify(context.report, times(1)).message(MessageId.OPF_044, item.getLocation(), "non-blessed-type");
    }

    // Additional tests should be written for private/other public methods.

    private ValidationContext initContext() throws IOException {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        context.path = "samplePath";
        context.report = Mockito.mock(ValidationReport.class);
        context.version = EPUBVersion.VERSION_3;
        context.epubFile = createTempFile();
        context.rootPath = context.epubFile.getParent() + "/";
        context.ocf = new OCFMock(context.epubFile, outWriter.INSTANCE);
        context.xrefChecker = new XRefChecker(context, context.version);
        context.zip = new ZipMock();
        return context;
    }

}