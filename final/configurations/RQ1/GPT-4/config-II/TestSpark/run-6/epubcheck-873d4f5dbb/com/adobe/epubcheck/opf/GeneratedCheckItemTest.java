package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        when(item.hasDataURL()).thenReturn(false);
        OPFChecker30 checker = new OPFChecker30(context);

        OPFHandler opfHandler = mock(OPFHandler.class);
        checker.checkItem(item, opfHandler);

        verify(context, times(1)).report();
    }

}