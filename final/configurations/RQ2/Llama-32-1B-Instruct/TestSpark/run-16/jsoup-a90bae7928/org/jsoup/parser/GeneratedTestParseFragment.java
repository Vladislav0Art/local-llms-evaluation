package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        String inputFragment = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment(inputFragment, "http://example.com", Mockito.mock(Parser.class), Mockito.any Element.class);
        Mockito.verify(builder).parse(Mockito.anyString(), Mockito.eq("http://example.com"), Mockito.eq("http://example.com"), Mockito.any(Parser.class));
    }

}