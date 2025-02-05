package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("name", "value");
        builder.insert(startTag);
        Element last = builder.stack.last();
        assertEquals("name", last.tagName());
        assertEquals("value", last.attr("value"));
    }

}