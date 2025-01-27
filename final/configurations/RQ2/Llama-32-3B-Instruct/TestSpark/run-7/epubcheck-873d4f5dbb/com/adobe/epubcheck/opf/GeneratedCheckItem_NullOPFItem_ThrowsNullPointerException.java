package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItem_NullOPFItem_ThrowsNullPointerException {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void checkItem_NullOPFItem_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> OPFChecker30.checkItem(null, null));
    }

}