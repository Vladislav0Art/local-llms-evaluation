package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedIsBlessedItemTypeTest {

    @Test
    public void isBlessedItemTypeTest() {
        String type = "application/xhtml+xml";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Assert.assertTrue(OPFChecker30.isBlessedItemType(type, version));
    }

}