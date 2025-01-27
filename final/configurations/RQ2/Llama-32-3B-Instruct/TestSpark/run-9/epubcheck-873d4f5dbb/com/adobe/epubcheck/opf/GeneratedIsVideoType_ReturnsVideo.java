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
public class GeneratedIsVideoType_ReturnsVideo {

    @Mock
    private OPFChecker opfChecker;

    @Test
    public void isVideoType_ReturnsVideo() {
        when(opfChecker.getEPUBVersion()).thenReturn(new EPUBVersion(1));
        boolean result = opfChecker.isVideoType("type");
        assertThat(result, is(true));
    }

}