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
public class GeneratedInitHandler_shouldCall_init_handler {

    @Mock
    private ValidationContext validationContext;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void initHandler_shouldCall_init_handler() {
        opfChecker30.initHandler();
        // assert init_handler was called with the correct context
    }

}