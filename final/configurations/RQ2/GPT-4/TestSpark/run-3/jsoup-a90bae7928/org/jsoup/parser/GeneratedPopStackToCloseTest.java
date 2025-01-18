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

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        Tag tag = Tag.valueOf("tag");
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("tag");
        startTag.tagName = tag;
        treeBuilder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag();
        endTag.nameAttr("tag");
        endTag.tagName = tag;
        treeBuilder.popStackToClose(endTag);
    }

}