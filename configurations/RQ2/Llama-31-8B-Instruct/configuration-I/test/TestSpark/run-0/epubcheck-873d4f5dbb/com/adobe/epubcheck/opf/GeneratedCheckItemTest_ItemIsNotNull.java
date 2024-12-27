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
public class GeneratedCheckItemTest_ItemIsNotNull {

    private OPFChecker30 opfChecker30;

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