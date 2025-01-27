package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoType_VideoType_ReturnsTrue {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isCommonVideoType_VideoType_ReturnsTrue() {
        assertTrue(OPFChecker30.isCommonVideoType("video"));
    }

}