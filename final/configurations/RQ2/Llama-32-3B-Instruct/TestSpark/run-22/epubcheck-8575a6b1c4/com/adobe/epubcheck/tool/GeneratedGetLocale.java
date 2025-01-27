package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedGetLocale {

    @Test
    public void getLocale() {
        Locale defaultLocale = Locale.getDefault();
        EpubChecker checker = new EpubChecker();
        Locale result = checker(Locale.class);
        assertEquals(defaultLocale, result);
    }

    public static class EpubChecker {

        public int run(String[] args) {
            // implementation
            return 0;
        }

        public int validate(String epubFile, String epbVersion, Report report, EPUBProfile profile) {
            // implementation
            return 1;
        }

        public Locale locale(Class<?> clazz) {
            return null;
        }
    }

    public static class Report {

    }

    public static class EPUBProfile {

    }

    public enum EPUBVersion {
        V2_0,
        V3_0
    }

}