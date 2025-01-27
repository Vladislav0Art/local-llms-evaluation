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
public class GeneratedIsBlessedFontType_ReturnsBlessedFont {

    @Mock
    private OPFChecker opfChecker;

    @Test
    public void isBlessedFontType_ReturnsBlessedFont() {
        when(opfChecker.getEPUBProfile()).thenReturn(new EPUBProfile());
        boolean result = opfChecker.isBlessedFontType("type");
        assertThat(result, is(true));
    }

}