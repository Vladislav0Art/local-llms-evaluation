package com.adobe.epubcheck.opf;

import org.junit.Test;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        ValidationContext context = new ValidationContext();
        OPFChecker30 checker = new OPFChecker30(context);
        boolean response = checker.checkContent();
        assertNotNull(response);
    }

}