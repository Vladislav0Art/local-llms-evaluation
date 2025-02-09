package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedCheckSpineItemTest {

    @Test
    public void CheckSpineItemTest() {
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30(validationContext);
        checker.checkSpineItem(item, opfHandler);
        Mockito.verify(opfHandler, Mockito.times(1)).checkSpineItem(item);
    }

}