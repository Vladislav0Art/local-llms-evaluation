package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCheckSpineItem_WithExceptions Test {

    @Test
    public void checkSpineItem_WithExceptions

    Test() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        new OPFChecker30(new ValidationContext()).checkSpineItem(item, opfHandler);
    }

}