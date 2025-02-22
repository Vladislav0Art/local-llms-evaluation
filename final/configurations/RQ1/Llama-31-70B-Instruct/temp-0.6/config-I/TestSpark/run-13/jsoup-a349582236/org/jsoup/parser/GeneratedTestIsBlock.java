package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Tag tag = new Tag("p");
        tag.isBlock = true;

        assertTrue(tag.isBlock());
    }

}