package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.runners.JUnit4.classWithResources;
import static org.mockito.Mockito.when;

@RunWith(classWithResources)
public class GeneratedGetPreferredMediaType_ReturnsPreferredMedia {

    @Mock
    private OPFChecker opfChecker;

    @Test
    public void getPreferredMediaType_ReturnsPreferredMedia() {
        when(opfChecker.getEPUBProfile()).thenReturn(new EPUBProfile());
        String result = opfChecker.getPreferredMediaType("type", "path");
        assertThat(result, is("preferred media"));
    }

}