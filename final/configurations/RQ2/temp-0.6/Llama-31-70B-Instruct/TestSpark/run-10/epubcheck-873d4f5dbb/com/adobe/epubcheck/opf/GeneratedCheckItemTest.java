package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.checkItem(Mockito.mock(OPFItem.class), Mockito.mock(OPFHandler.class));

        assertTrue(opfChecker30.isValid());
    }

}