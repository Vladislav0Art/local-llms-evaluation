package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitHandler_InitsHandler {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void initHandler_InitsHandler() {
        // Arrange
        Object handler = Mockito.mock(ValidationContext.class);

        // Act
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        boolean result = opfChecker30.initHandler();

        // Assert
        Mockito.verify(handler).init();
        org.junit.Assert.assertTrue(result);
    }

}