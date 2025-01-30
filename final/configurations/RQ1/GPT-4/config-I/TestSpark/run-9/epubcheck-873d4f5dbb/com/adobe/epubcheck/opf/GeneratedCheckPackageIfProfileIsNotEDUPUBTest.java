package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.url.URLFragment;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Set;

public class GeneratedCheckPackageIfProfileIsNotEDUPUBTest {

    @Test
    public void checkPackageIfProfileIsNotEDUPUBTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        when(context.profile).thenReturn(EPUBProfile.DEFAULT);

        assertFalse(opfChecker30.checkPackage());
    }

}