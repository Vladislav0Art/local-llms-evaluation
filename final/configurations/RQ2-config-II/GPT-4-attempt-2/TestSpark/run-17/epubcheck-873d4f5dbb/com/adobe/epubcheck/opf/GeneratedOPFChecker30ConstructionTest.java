package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedOPFChecker30ConstructionTest {

    @Test
    public void OPFChecker30ConstructionTest() {
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(validationContext);
        assertNotNull(checker);
    }

}