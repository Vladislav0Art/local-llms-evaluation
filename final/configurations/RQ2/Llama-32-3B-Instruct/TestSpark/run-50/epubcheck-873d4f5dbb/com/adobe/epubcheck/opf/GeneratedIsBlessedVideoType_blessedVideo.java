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
public class GeneratedIsBlessedVideoType_blessedVideo {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isBlessedVideoType_blessedVideo() {
        String type = "blessed video";

        // When and Then
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertTrue(result);
    }

}