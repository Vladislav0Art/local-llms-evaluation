package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestParseFragmentNullBaseUri {

    @Test
    public void testParseFragmentNullBaseUri() {
        Element element = new Element("http://example.com");
        String fragment = null;
        assertTrue(element.parseFragment(fragment, null, null));
    }

}