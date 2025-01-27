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
import static org.mockito.Mockito.verify;

@RunWith(classWithResources)
public class GeneratedCheckContent ValidatesCheck {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkContent

    ValidatesCheck() {
        when(context.getEPUBProfile()).thenReturn(new EPUBProfile());
        boolean result = new OPFChecker30(context).checkContent();
        verify(opfHandler).validateContent(result);
    }

}