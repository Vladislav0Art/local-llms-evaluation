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
public class GeneratedCheckContent_nonEmptyResourceCollection {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void checkContent_nonEmptyResourceCollection() {
        when(validationContext.getOPFVersion()).thenReturn("30");
        when(validationContext.isValidationDisabled()).thenReturn(false);

        Set<Metadata> metadataSet = Collections.singleton(new Metadata(1, "metadata"));
        when(validationContext.getResourceCollection()).thenReturn(metadataSet);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        assertTrue(opfChecker30.checkContent());
    }

}