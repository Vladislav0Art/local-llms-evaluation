package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext validationContext = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        OPFItem item = mock(OPFItem.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        opfChecker30.checkItem(item, opfHandler);
    }

}