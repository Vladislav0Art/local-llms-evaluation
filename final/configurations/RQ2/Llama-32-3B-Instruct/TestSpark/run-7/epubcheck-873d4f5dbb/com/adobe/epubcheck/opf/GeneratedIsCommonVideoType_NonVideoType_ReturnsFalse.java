package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoType_NonVideoType_ReturnsFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isCommonVideoType_NonVideoType_ReturnsFalse() {
        assertFalse(OPFChecker30.isCommonVideoType("text"));
    }

}