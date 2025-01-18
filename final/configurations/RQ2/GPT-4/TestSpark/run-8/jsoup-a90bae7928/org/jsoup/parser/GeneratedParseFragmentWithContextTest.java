package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("p"), "");
        List nodeList = builder.parseFragment("<xml></xml>", context, "", Parser.xmlParser());
        assertTrue(!nodeList.isEmpty());
    }

}