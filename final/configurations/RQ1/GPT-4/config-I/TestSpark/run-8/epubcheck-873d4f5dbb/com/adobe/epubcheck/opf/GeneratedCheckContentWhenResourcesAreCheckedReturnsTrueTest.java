package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.MetadataSet.Metadata;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedCheckContentWhenResourcesAreCheckedReturnsTrueTest {

    @Test
    public void checkContentWhenResourcesAreCheckedReturnsTrueTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker30 = new OPFChecker30(context);

        checker30.checkContent();

        assertTrue(checker30.checkContent());
    }

}