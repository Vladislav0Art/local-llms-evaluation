package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedGetLocale_EmptyString_ReturnsNull {

    @Test
    public void getLocale_EmptyString_ReturnsNull() {
        EpubChecker epubChecker = new EpubChecker();
        assertNull(epubChecker.getLocale(""));
    }

}