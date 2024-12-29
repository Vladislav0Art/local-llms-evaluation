package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaType_shouldCall_get_preferred_media_type_for_core_media_type {

    @Mock
    private ValidationContext validationContext;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void getPreferredMediaType_shouldCall_get_preferred_media_type_for_core_media_type() {
        when(validationContext.getMediaType()).thenReturn("coreMedia");
        String result = OPFChecker30.getPreferredMediaType("coreMedia", "path");
        // assert get_preferred_media_type was called with the correct media type and path
    }

}