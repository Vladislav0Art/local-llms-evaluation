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
public class GeneratedCheckContent_return_false {

    @Mock
    private ValidationContext validationContext;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkContent_return_false() {
        when(validationContext.isSpineItem()).thenReturn(false);
        boolean result = opfChecker30.checkContent();
        assertThat(result, is(false));
    }

}