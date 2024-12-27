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

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        OPFItemBuilder itemBuilder = new OPFItemBuilder();
        OPFItem item = itemBuilder.withId("id").withHref("href").withMediaType("media-type").build();
        OPFHandler handler = new OPFHandler(ValidationContextBuilder.aValidationContext().withPath("path").build());
        OPFChecker30 checker = new OPFChecker30(ValidationContextBuilder.aValidationContext().build());
        checker.checkItem(item, handler);
        // Add assertions as needed
    }

}