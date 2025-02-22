package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.util.Map;
import java.util.HashMap;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock());
    }

}