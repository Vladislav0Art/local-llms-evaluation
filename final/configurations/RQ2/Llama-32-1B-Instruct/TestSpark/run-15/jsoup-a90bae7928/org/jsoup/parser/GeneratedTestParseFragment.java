package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        List<Node> nodes = new XmlTreeBuilder().parseFragment("<a><b/>c</b></a>", "http://example.com", new XmlTreeBuilder());
        Assert.assertTrue(nodes.contains(new Node(Element.Tag("root"), new CDataNode(), new Comment(), new Token.StartTag("a"), new Token.StopTag())));
    }

}