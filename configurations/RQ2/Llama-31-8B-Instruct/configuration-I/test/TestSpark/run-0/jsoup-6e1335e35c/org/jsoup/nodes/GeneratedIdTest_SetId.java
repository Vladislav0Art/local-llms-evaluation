package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Range;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class GeneratedIdTest_SetId {

    @Test
    public void idTest_SetId() {
        Element element = new Element(Tag.valueOf("div"));
        element.id("myId");
        assertEquals("myId", element.id());
    }

}