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

public class GeneratedCheckItemDataUrlTest {

    @Test
    public void checkItemDataUrlTest() {
        OPFItem opfItem = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);

        when(opfItem.hasDataURL()).thenReturn(true);
        when(opfItem.getLocation()).thenReturn(null);

        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        checker.initHandler();
        checker.checkItem(opfItem, opfHandler);

        Mockito.verify(checker, Mockito.times(1)).checkItem(opfItem, opfHandler);
    }

}