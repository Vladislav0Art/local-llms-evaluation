package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import static org.mockito.Mockito.*;

import org.w3c.epubcheck.core.EPUBLocation;

import java.io.File;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        ValidationContext validationContext = mock(ValidationContext.class);
        when(validationContext.getVersion()).thenReturn(EPUBVersion.VERSION_3);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        boolean result = opfChecker30.checkContent();
        assert (result);
    }

}