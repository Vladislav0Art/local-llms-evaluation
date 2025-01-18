package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTestInsertTagTest {

    @Test
    public void testInsertTagTest() {
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        Tag tag = Tag.valueOf("tag");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("tag");
        startTag.tagName = tag;
        Element element = treeBuilder.insert(startTag);
        Assert.assertNotNull(element);
    }

}