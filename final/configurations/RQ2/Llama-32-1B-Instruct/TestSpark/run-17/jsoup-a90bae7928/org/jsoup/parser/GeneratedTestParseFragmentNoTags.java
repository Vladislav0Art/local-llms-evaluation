package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseFragmentNoTags {

    @Test
    public void testParseFragmentNoTags() throws Exception {
        String inputString = "<fragment></fragment>";
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertNotNull(document);
        List<Node> nodes = ((Document) document).getElementsByTagName("a").item(0).children();
        assertEquals(null, nodes);
    }

}