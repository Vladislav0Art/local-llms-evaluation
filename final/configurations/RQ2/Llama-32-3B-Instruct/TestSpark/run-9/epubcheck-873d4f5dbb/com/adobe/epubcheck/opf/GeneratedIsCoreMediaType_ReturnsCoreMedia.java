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
public class GeneratedIsCoreMediaType_ReturnsCoreMedia {

    @Mock
    private OPFChecker opfChecker;

    @Test
    public void isCoreMediaType_ReturnsCoreMedia() {
        when(opfChecker.getEPUBVersion()).thenReturn(new EPUBVersion(1));
        boolean result = opfChecker.isCoreMediaType("type");
        assertThat(result, is(true));
    }

}