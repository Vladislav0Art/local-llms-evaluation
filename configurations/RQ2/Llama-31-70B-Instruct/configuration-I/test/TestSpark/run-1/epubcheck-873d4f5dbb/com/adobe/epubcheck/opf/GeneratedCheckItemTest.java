package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        opfChecker30.checkItem(mock(OPFItem.class), mock(OPFHandler.class));
        // assertions
    }

}