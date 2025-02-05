package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = Mockito.mock(Parser.class);
        Element context = Mockito.mock(Element.class);
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test>", context, "http://localhost", parser);
        Assert.assertNotNull(nodes);
    }

}