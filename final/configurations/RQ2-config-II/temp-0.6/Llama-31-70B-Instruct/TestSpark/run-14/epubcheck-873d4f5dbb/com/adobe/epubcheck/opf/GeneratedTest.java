package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.ValidationContext;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        // Given
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);

        // When
        opfChecker30.initHandler();

        // Then
    }

    @Test
    public void checkPackageTest() {
        // Given
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);

        // When
        boolean result = opfChecker30.checkPackage();

        // Then
        assertTrue(result);
    }

    @Test
    public void checkContentTest() {
        // Given
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);

        // When
        boolean result = opfChecker30.checkContent();

        // Then
        assertTrue(result);
    }

}