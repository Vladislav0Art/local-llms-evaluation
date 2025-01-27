package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedCheckSpineItem_nullItem {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFChecker30 opfChecker30;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(opfChecker30.getValidationContext()).thenReturn(validationContext);
    }

    @Test
    public void checkSpineItem_nullItem() {
        assertFalse(opfChecker30.checkSpineItem(null, null));
    }

}