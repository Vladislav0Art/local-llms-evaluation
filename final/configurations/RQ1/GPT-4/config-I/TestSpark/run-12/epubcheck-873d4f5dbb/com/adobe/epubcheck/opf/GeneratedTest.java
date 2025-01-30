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

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
        assertNotNull(checker.opfHandler);
    }

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

    @Test
    public void checkItemRemoteTest() throws URISyntaxException {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        context.version = EPUBVersion.VERSION_3;
        OPFItem item = new OPFItem(new URI("test1.epub"), "video/h264", "itemId", "mediaOvelrayId", Optional.of("fallbackId"), false, true, false);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(item);
        assertTrue(item.isRemote());
    }

    @Test
    public void checkBlessedItemTypeTest() {
        boolean result = OPFChecker30.isBlessedItemType("video/h264", EPUBVersion.VERSION_3);
        assertTrue(result);
    }

    @Test
    public void checkPreferredMediaTypeTest() {
        String result = OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.otf");
        assertEquals("font/otf", result);
    }

}