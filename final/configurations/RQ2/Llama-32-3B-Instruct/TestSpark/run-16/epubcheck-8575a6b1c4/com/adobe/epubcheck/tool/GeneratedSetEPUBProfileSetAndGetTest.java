package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedSetEPUBProfileSetAndGetTest {

    @Test
    public void setEPUBProfileSetAndGetTest() {
        EpubChecker.setEPUBProfile(new EPUBProfile(true));
        assertEquals(true, EpubChecker.getEPUBProfile().isEpub2Compatible());
    }

}