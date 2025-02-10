package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCheckItem_WithExceptions Test {

    @Test
    public void checkItem_WithExceptions

    Test() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        new OPFChecker30(new ValidationContext()).checkItem(item, opfHandler);
    }

}