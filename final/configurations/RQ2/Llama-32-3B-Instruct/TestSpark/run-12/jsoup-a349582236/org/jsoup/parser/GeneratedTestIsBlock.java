package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedTestIsBlock {

    public static Tag valueOf(String tagName) {
        return new Tag(tagName);
    }

    private Tag() {
    }

    public String getName() {
        return "tagName";
    }

    @Test
    public void testIsBlock() {
        assertTrue(createTag().isBlock());
    }

}