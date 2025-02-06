package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedEqualsDifferentTagsTest {

    @Test
    public void equalsDifferentTagsTest() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertFalse(tag1.equals(tag2));
    }

}