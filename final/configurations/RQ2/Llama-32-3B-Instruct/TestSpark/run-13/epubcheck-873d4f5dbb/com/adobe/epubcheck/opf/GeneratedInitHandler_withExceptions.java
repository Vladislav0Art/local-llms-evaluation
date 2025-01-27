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
public class GeneratedInitHandler_withExceptions {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void initHandler_withExceptions() {
        when(validationContext.getOPFVersion()).thenReturn("3.0");
        when(validationContext.isValidationDisabled()).thenReturn(false);
        when(validationContext.isOfflineMode()).thenReturn(true);

        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        opfChecker30.initHandler();

        assertFalse(opfChecker30.getValidationResult().getHasExceptions());
    }

}