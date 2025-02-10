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
public class GeneratedGetPreferredMediaType_preferredMediaType_path {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void getPreferredMediaType_preferredMediaType_path() {
        String type = "application/epub+json";
        String path = "/path/to/file";

        // When and Then
        String preferredMediaType = OPFChecker30.getPreferredMediaType(type, path);
        assertEquals(type, preferredMediaType);
    }

}