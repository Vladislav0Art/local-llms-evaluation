package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedScriptTypeValidTypeTest {

    @Test
    public void isBlessedScriptTypeValidTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
    }

}