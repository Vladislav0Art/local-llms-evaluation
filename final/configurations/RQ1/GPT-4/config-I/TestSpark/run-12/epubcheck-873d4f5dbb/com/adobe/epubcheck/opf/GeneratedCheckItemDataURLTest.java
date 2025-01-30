package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.url.URL;
import com.google.common.base.Optional;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckItemDataURLTest {

    @Test
    public void checkItemDataURLTest() throws URISyntaxException {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFItem item = new OPFItem(new URI("test1.epub"), "testType", "itemId", "mediaOvelrayId", Optional.of("fallbackId"), false, false, false);
        item.setDataURL(true);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, opfHandler);
        assertTrue(item.hasDataURL());
    }

}