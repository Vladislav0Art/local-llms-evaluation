package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemTest_ItemIsNull {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkItemTest_ItemIsNull() {
        // Arrange
        OPFHandler opfHandler = new OPFHandler();

        // Act
        opfChecker30.checkItem(null, opfHandler);

        // Assert
        verify(opfHandler, never()).handle(any(OPFItem.class));
    }

}