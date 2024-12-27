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
public class GeneratedInitHandlerTest_NoExceptionThrown {

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

}