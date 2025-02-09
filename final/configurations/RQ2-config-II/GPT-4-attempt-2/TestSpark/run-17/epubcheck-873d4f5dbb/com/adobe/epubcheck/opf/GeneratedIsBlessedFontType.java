package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsBlessedFontType {

    @Test
    public void IsBlessedFontType() {
        String type = "application/x-font-ttf";
        assertTrue(OPFChecker30.isBlessedFontType(type));
    }

}