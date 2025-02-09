package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsNotBlessedFontType {

    @Test
    public void IsNotBlessedFontType() {
        String type = "application/random-font";
        assertFalse(OPFChecker30.isBlessedFontType(type));
    }

}