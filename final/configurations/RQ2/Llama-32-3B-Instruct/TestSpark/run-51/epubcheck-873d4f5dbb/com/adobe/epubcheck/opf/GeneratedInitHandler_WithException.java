package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitHandler_WithException {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 subject;

    @Test
    public void initHandler_WithException() {
        throw new Exception("Test exception");
        subject.initHandler();
    }

}