package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
        opfChecker30.initHandler();
        // assertions
    }

}