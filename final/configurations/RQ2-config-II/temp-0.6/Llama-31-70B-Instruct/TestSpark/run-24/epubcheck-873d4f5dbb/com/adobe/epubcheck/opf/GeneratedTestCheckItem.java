package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckItem {

    @Mock
    private ValidationContext mockValidationContext;

    @Mock
    private OPFHandler mockOPFHandler;

    @Test
    public void testCheckItem() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mockValidationContext);
        OPFItem mockOPFItem = new OPFItem("item", "item", "item");
        opfChecker30.checkItem(mockOPFItem, mockOPFHandler);
        assertEquals(opfChecker30.getClass(), OPFChecker30.class);
    }

}