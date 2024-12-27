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
public class GeneratedCheckPackageTest_ReturnsTrue {

    private OPFChecker30 opfChecker30;

    @Test
    public void checkPackageTest_ReturnsTrue() {
        // Arrange
        ValidationContext context = new ValidationContext();

        // Act
        opfChecker30 = new OPFChecker30(context);
        boolean result = opfChecker30.checkPackage();

        // Assert
        assertTrue(result);
    }

}