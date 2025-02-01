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

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        String path = "testPath";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = Mockito.mock(Report.class);
        HrefCheckerFactory hrefCheckerFactory = Mockito.mock(HrefCheckerFactory.class);
        MessageDictionary dictionary = Mockito.mock(MessageDictionary.class);

        ValidationContext context = new ValidationContextBuilder()
                .path(path)
                .version(version)
                .report(report)
                .hrefCheckerFactory(hrefCheckerFactory)
                .dictionary(dictionary)
                .build();

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.initHandler();

        assertNotNull(opfChecker30.opfHandler);
        assertTrue(opfChecker30.opfHandler instanceof OPFHandler30);
    }

}