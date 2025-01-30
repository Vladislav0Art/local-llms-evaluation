package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.*;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.isFontType("font/ttf");
    }

}