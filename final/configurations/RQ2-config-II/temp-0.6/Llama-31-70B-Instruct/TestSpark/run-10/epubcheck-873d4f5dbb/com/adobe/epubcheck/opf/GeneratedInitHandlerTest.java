package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitHandlerTest {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void initHandlerTest() {
        opfChecker30.initHandler();
        assertTrue(true);
    }

}