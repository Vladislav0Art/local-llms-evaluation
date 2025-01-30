package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.vocab.DCMESVocab;
import com.adobe.epubcheck.vocab.PackageVocabs;
import com.adobe.epubcheck.w3c.SmartURL;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() throws URISyntaxException {
        ValidationContext context = new ValidationContext(
                new EPUBVersion("3.0"),
                new SmartURL(new URI("http://example.com")),
                "context"
        );
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
        assertNotNull(context.handler);
    }

}