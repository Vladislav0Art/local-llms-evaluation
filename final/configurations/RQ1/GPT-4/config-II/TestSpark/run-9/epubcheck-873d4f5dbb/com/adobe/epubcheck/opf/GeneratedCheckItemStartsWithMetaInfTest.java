package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.href.HrefCheckerFactory;
import com.adobe.epubcheck.messages.MessageDictionary;
import com.adobe.epubcheck.messages.Report;
import com.adobe.epubcheck.opf.ValidationContext.ValidationContextBuilder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckItemStartsWithMetaInfTest {

    @Test
    public void checkItemStartsWithMetaInfTest() {
        String path = "META-INF/foo";
        String contentType = "application/xhtml+xml";
        String mimeType = "application/xhtml+xml";
        String fallback = null;
        String mediaOverlay = null;
        boolean linear = false;
        boolean remote = false;

        OPFItem item = new OPFItem(path, contentType, mimeType, fallback, mediaOverlay, linear, remote);

        OPFChecker30 checker = createOPFChecker();
        checker.checkItem(item, checker.opfHandler);

        verify(checker.report, times(1)).message(any(), any());
    }

    // add more tests ...

    private OPFChecker30 createOPFChecker() {
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(validationContext);
        checker.report = Mockito.mock(Report.class);
        checker.opfHandler = Mockito.mock(OPFHandler.class);
        return checker;
    }

}