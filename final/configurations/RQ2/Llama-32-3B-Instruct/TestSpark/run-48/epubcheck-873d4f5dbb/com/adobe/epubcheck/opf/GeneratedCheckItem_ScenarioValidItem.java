package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItem_ScenarioValidItem {

    @Mock
    private ValidationContext context;

    @Test
    public void checkItem_ScenarioValidItem() {
        OPFItem item = Mockito.mock(OPFItem.class);
        when(item.getName()).thenReturn("test");
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);

        // Act and Assert
        boolean result = OPFChecker30.checkItem(item, opfHandler);
        assertTrue(result);
    }

}