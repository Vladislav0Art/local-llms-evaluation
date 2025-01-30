package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeTest() {
        String mediaType = "text/javascript";
        assert (OPFChecker30.isCoreMediaType(mediaType));
    }

}