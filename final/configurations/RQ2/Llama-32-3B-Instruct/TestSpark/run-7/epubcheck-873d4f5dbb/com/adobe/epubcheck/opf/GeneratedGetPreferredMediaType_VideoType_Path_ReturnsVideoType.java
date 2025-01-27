package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaType_VideoType_Path_ReturnsVideoType {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void getPreferredMediaType_VideoType_Path_ReturnsVideoType() {
        String result = OPFChecker30.getPreferredMediaType("video", "path");
        assertEquals("video", result);
    }

}