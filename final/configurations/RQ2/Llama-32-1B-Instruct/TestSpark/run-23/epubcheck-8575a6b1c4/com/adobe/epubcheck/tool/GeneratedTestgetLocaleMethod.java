package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestgetLocaleMethod {

    @Test
    public void testgetLocaleMethod() {
        String locale = EpubChecker.getLocale();
        assertThat(locale, is("en"));
    }

}