package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.*;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFItem item = mock(OPFItem.class);
        when(item.getLocation()).thenReturn(mock(EPUBLocation.class));
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(item);
    }

}