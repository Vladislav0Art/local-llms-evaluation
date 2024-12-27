package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.JUnit4;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.InjectMocks;

@RunWith(JUnit4.class)
public class GeneratedCheckContentTest_ReturnsTrue {

    private OPFChecker30 opfChecker30;

    @Test
    public void checkContentTest_ReturnsTrue() {
        // Act
        opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkContent();

        // Assert
        assertTrue(result);
    }

}