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

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFItem item = mock(OPFItem.class);
        when(context.referenceRegistry.get()).thenReturn(Collections.<Reference>emptyList());
        when(item.isInSpine()).thenReturn(false);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(item);
        verify(context.getMessageDictionary(), times(1)).getMessage(any(), anyVararg());
    }

}