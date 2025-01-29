package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() throws Exception {
        String inputString = "<fragment><a></a></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(1, nodes.size());
    }

}