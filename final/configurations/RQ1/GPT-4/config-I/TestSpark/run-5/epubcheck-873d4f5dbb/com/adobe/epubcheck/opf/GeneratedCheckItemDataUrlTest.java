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

public class GeneratedCheckItemDataUrlTest {

    @Test
    public void checkItemDataUrlTest() {
        ValidationContext validationContext = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        OPFItem opfItem = mock(OPFItem.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        when(opfItem.hasDataURL()).thenReturn(true);
        when(opfItem.getLocation()).thenReturn(EPUBLocation.create(new File(""), 1, 2));
        opfChecker30.checkItem(opfItem, opfHandler);
        verify(validationContext).reportInfo(any(Feature.class));
    }

}