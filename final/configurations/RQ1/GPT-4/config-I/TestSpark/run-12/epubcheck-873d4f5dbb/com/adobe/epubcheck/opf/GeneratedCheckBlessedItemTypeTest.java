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

public class GeneratedCheckBlessedItemTypeTest {

    @Test
    public void checkBlessedItemTypeTest() {
        boolean result = OPFChecker30.isBlessedItemType("video/h264", EPUBVersion.VERSION_3);
        assertTrue(result);
    }

}