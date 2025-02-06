package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class GeneratedGetLocale_none_test {

    @Test
    public void getLocale_none_test() {
        assertNull(new EpubChecker().getLocale());
    }

}