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
public class GeneratedTestHashCode {

    public static Tag valueOf(String tagName) {
        return new Tag(tagName);
    }

    private Tag() {
    }

    public String getName() {
        return "tagName";
    }

    @Test
    public void testHashCode() {
        Tag tag1 = valueOf("tagName");
        Tag tag2 = valueOf("tagName");
        assertEquals(0, tag1.hashCode());
        assertEquals(0, tag2.hashCode());
    }

}