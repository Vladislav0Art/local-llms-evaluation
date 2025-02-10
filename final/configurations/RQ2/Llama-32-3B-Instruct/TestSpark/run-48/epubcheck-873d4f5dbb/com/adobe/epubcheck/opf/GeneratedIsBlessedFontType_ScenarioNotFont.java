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
public class GeneratedIsBlessedFontType_ScenarioNotFont {

    @Mock
    private ValidationContext context;

    @Test
    public void isBlessedFontType_ScenarioNotFont() {
        String type = "not font";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertFalse(result);
    }

}