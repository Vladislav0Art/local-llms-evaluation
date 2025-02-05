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

public class GeneratedParseFragmentWithParserTest {

    @Test
    public void parseFragmentWithParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test>", "http://localhost", parser);
        Assert.assertNotNull(nodes);
    }

}