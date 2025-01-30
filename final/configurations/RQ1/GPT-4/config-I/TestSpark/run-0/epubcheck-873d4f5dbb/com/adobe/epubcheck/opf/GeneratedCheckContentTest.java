package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.*;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkContent();
    }

}