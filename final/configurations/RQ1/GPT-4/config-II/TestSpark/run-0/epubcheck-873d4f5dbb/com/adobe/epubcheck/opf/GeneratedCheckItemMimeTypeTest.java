package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.util.FeatureEnum;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;

import static org.mockito.Mockito.*;

public class GeneratedCheckItemMimeTypeTest {

    @Test
    public void checkItemMimeTypeTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = mock(OPFItem.class);
        when(item.hasDataURL()).thenReturn(false);
        when(item.getPath()).thenReturn("test.epub");
        when(item.getMimeType()).thenReturn("");
        checker.checkItem(item, mock(OPFHandler30.class));
        verify(context.getMessageDictionary(), never()).getMessage(any(), anyVararg());
    }

}