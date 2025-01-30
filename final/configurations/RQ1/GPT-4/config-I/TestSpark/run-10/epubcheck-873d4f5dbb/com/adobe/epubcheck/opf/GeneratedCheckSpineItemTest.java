package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCheckSpineItemTest {

    @Test
    public void checkSpineItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = mock(OPFItem.class);
        when(item.hasDataURL()).thenReturn(false);
        checker.checkSpineItem(item, mock(OPFHandler.class));
    }

}