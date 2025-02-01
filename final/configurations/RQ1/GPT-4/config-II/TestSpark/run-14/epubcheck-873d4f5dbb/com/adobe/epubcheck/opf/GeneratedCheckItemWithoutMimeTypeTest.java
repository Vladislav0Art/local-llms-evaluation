package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.DocumentValidator;
import com.google.common.base.Optional;
import io.mola.galimatias.URL;

public class GeneratedCheckItemWithoutMimeTypeTest {

    @Test
    public void checkItemWithoutMimeTypeTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        URL url = mock(URL.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = new OPFItem("Test", url, opfHandler);

        checker.checkItem(item, opfHandler);
        verify(context.getMessage(), never()).message(Mockito.any(), Mockito.any());
    }

}