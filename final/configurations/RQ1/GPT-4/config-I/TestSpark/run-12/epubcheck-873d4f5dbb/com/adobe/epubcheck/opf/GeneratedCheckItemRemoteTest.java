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

public class GeneratedCheckItemRemoteTest {

    @Test
    public void checkItemRemoteTest() throws URISyntaxException {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        context.version = EPUBVersion.VERSION_3;
        OPFItem item = new OPFItem(new URI("test1.epub"), "video/h264", "itemId", "mediaOvelrayId", Optional.of("fallbackId"), false, true, false);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(item);
        assertTrue(item.isRemote());
    }

}