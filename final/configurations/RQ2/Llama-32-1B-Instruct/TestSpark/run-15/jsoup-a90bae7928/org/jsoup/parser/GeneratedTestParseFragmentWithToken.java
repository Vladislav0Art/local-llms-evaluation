package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseFragmentWithToken {

    @Test
    public void testParseFragmentWithToken() {
        List<Node> nodes = new XmlTreeBuilder().parseFragment("<a><b/>c</b></a>", "http://example.com", new XmlTreeBuilder());
        Assert.assertTrue(nodes.contains(new Node(Element.Tag("root"), new CDataNode(), new Comment(), new Token.StartTag("a"), new Token.StopTag())));
    }

}