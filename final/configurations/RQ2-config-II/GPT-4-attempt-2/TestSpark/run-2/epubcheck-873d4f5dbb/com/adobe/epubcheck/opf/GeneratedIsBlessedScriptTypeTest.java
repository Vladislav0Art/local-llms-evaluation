package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedIsBlessedScriptTypeTest {

    @Test
    public void isBlessedScriptTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("text/x-javascript"));
    }

}