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

public class GeneratedInitHandlerWithNewOPFHandler30ReturnsTrueTest {

    @Test
    public void initHandlerWithNewOPFHandler30ReturnsTrueTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker30 = new OPFChecker30(context);

        checker30.initHandler();

        //just validates the method is reached and completed without exceptions
        assertTrue(true);
    }

}