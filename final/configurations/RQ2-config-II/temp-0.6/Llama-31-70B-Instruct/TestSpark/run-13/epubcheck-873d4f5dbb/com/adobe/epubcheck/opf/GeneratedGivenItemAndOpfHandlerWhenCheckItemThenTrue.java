package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.w3c.epubcheck.api.EPUBLocation;
import org.w3c.epubcheck.api.EPUBProfile;
import org.w3c.epubcheck.messages.MessageId;
import org.w3c.epubcheck.opf.OPFItem;
import org.w3c.epubcheck.util.url.URLFragment;

public class GeneratedGivenItemAndOpfHandlerWhenCheckItemThenTrue {

    private OPFChecker30 opfChecker30;

    @Before
    public void setup() {
        opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
    }

    @Test
    public void givenItemAndOpfHandlerWhenCheckItemThenTrue() {
        assertEquals(true, opfChecker30.checkItem(new OPFItem(), mock(OPFHandler.class)));
    }

}