package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.outWriter;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.messages.MessageId;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        ByteArrayOutputStream outWriter = new ByteArrayOutputStream();
        Report report = new outWriter(outWriter);
        String path = "test.epub";
        EPUBVersion version = EPUBVersion.VERSION_3;
        OPFChecker30 checker = new OPFChecker30(path, version, report);
        checker.initHandler();
        assertTrue(outWriter.toString().isEmpty());
    }

}