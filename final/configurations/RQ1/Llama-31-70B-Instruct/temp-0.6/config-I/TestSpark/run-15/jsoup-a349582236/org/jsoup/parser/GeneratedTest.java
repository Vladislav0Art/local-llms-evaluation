package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    private final Tag tag = new Tag("div");

    @Test
    public void cloneTagTest() {
        Tag clone = tag.clone();
        assertEquals(tag.getName(), clone.getName());
        assertEquals(tag.isBlock(), clone.isBlock());
        assertEquals(tag.formatAsBlock(), clone.formatAsBlock());
        assertEquals(tag.isEmpty(), clone.isEmpty());
        assertEquals(tag.isSelfClosing(), clone.isSelfClosing());
        assertEquals(tag.preserveWhitespace(), clone.preserveWhitespace());
        assertEquals(tag.isFormListed(), clone.isFormListed());
        assertEquals(tag.isFormSubmittable(), clone.isFormSubmittable());
    }

}