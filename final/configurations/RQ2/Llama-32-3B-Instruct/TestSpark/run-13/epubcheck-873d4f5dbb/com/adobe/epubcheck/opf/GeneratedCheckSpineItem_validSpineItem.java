package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedCheckSpineItem_validSpineItem {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void checkSpineItem_validSpineItem() {
        when(validationContext.getOPFVersion()).thenReturn("30");
        when(validationContext.isValidationDisabled()).thenReturn(false);

        OPFItem item = mock(OPFItem.class);
        when(item.isValid()).thenReturn(true);

        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        assertTrue(opfChecker30.checkSpineItem(item, mock(OPFHandler.class)));
    }

}