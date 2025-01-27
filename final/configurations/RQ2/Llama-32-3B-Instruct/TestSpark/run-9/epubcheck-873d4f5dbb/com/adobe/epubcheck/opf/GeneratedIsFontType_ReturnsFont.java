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
public class GeneratedIsFontType_ReturnsFont {

    @Mock
    private OPFChecker opfChecker;

    @Test
    public void isFontType_ReturnsFont() {
        when(opfChecker.getEPUBProfile()).thenReturn(new EPUBProfile());
        boolean result = opfChecker.isFontType("type");
        assertThat(result, is(true));
    }

}