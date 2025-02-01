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

public class GeneratedCheckItemDataUrlTest {

    @Test
    public void checkItemDataUrlTest() {
        String path = "testPath";
        String contentType = "application/xhtml+xml";
        String mimeType = "application/xhtml+xml";
        String fallback = null;
        String mediaOverlay = null;
        boolean linear = false;
        boolean remote = false;

        OPFItem item = new OPFItem(path, contentType, mimeType, fallback, mediaOverlay, linear, remote);
        item.setDataURL("http://example.com");

        OPFChecker30 checker = createOPFChecker();
        checker.checkItem(item, checker.opfHandler);

        verify(checker.report, times(1)).message(any(), any());
    }

}