package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckContentTest_ReturnsFalse {

    private OPFChecker30 opfChecker30;

    @Test
    public void checkContentTest_ReturnsFalse() {
        // Act
        opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkContent();

        // Assert
        assertFalse(result);
    }

}