package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        OPFItem opfItem = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        opfChecker30.checkItem(opfItem, opfHandler);
    }

}