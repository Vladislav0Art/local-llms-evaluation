package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest_parseFragmentEmptyString {

    @Test
    public void test_parseFragmentEmptyString() {
        Element element = new Element("");
        String fragment = "foo";
        assertTrue(element.parseFragment(fragment, null, null));
    }

}