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

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem opfItem = Mockito.mock(OPFItem.class);

        when(opfItem.isRemote()).thenReturn(true);
        when(opfItem.getMimeType()).thenReturn("unsupportedMimeType");

        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        checker.initHandler();
        checker.checkItemAfterResourceValidation(opfItem);

        Mockito.verify(checker, Mockito.times(1)).checkItemAfterResourceValidation(opfItem);
    }

}