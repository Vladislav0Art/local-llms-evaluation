package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckSpineItem_NullOPFItem_ThrowsNullPointerException {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void checkSpineItem_NullOPFItem_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> OPFChecker30.checkSpineItem(null, null));
    }

}