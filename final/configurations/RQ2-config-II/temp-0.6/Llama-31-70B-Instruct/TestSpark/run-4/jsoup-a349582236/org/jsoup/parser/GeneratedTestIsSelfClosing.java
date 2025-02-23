package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestIsSelfClosing {

    @Test
    public void testIsSelfClosing() {
        Tag tag = Tag.valueOf("p");
        assertEquals(false, tag.isSelfClosing());
    }

}