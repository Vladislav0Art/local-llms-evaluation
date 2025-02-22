package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedShouldReturnTrueForBlockTag {

    @Test
    public void shouldReturnTrueForBlockTag() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

}