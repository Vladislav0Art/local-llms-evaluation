package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.ValidationContext.ValidationContextBuilder;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem.OPFItemBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.ValidationContext;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        OPFChecker30 checker = new OPFChecker30(ValidationContextBuilder.aValidationContext().build());
        boolean result = checker.checkContent();
        // Add expected result and assertion
    }

}