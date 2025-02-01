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

public class GeneratedCheckItemDataUrlTest {

    @Test
    public void checkItemDataUrlTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = mock(OPFItem.class);
        when(item.hasDataURL()).thenReturn(true);
        when(item.getLocation()).thenReturn(EPUBLocation.create("test.epub"));
        checker.checkItem(item, mock(OPFHandler30.class));
        verify(context.getMessageDictionary(), times(1)).getMessage(any(), anyVararg());
    }

}