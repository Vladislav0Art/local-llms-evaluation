package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragment_String_Element_String_ParserTest {

    @Test
    public void parseFragment_String_Element_String_ParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test></test>", new Element(Tag.valueOf("div"), "http://base.uri"), "http://base.uri", new Parser(xmlTreeBuilder));

        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("test", nodes.get(0).nodeName());
    }

}