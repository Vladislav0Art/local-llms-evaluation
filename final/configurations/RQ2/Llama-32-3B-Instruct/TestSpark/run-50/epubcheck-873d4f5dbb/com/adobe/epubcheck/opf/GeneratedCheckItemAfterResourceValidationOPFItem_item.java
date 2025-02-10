package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemAfterResourceValidationOPFItem_item {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void checkItemAfterResourceValidationOPFItem_item() {
        OPFItem item = Mockito.mock(OPFItem.class);

        // When
        OPFChecker30.checkItemAfterResourceValidation(item);

        // Then
        verify(item).setItem(Mockito.anyString());
    }

}