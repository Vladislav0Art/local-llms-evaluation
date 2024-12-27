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
public class GeneratedTest {

    private OPFChecker30 opfChecker30;

    @Test
    public void initHandlerTest_NoExceptionThrown() {
        // Arrange
        ValidationContext context = new ValidationContext();

        // Act
        opfChecker30 = new OPFChecker30(context);
        opfChecker30.initHandler();

        // Assert
        // No assertion needed, no exception thrown
    }

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

    @Test
    public void checkPackageTest_ReturnsFalse() {
        // Arrange
        ValidationContext context = new ValidationContext();
        when(context.getPackage()).thenReturn(null);

        // Act
        opfChecker30 = new OPFChecker30(context);
        boolean result = opfChecker30.checkPackage();

        // Assert
        assertFalse(result);
    }

    @Test
    public void checkContentTest_ReturnsTrue() {
        // Act
        opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkContent();

        // Assert
        assertTrue(result);
    }

    @Test
    public void checkContentTest_ReturnsFalse() {
        // Act
        opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkContent();

        // Assert
        assertFalse(result);
    }

    @Test
    public void checkItemTest_ItemIsNotNull() {
        // Arrange
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();

        // Act
        opfChecker30 = new OPFChecker30(new ValidationContext());
        opfChecker30.checkItem(item, opfHandler);

        // Assert
        verify(opfHandler).handle(item);
    }

}