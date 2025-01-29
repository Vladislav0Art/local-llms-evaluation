package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseFragmentWithTokenAndBaseUri {

    @Test
    public void testParseFragmentWithTokenAndBaseUri() {
        List<Node> nodes = new XmlTreeBuilder().parseFragment("<a><b/>c</b></a>", "http://example.com", "http://example.com");
        Assert.assertTrue(nodes.contains(new Node(Element.Tag("root"), new CDataNode(), new Comment(), new Token.StartTag("a"), new Token.StopTag())));
    }

}