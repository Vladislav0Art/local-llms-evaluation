package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFHandler30 opfHandler = Mockito.mock(OPFHandler30.class);
        OPFItem item = Mockito.mock(OPFItem.class);

        Mockito.when(item.hasDataURL()).thenReturn(true);

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(item, opfHandler);

        Mockito.verify(opfHandler, Mockito.times(1)).getItemById(Mockito.anyString());
    }

}