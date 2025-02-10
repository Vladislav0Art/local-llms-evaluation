package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsFontType_ScenarioFont {

    @Mock
    private ValidationContext context;

    @Test
    public void isFontType_ScenarioFont() {
        String type = "font";
        boolean result = OPFChecker30.isFontType(type);
        assertTrue(result);
    }

}