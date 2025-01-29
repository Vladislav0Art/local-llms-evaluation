package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseEmptyInput {

    @Test
    public void testParseEmptyInput() {
        String baseUri = "";
        Parser parser = new Parser();
        Document document = new XmlTreeBuilder().parse(inputReader, baseUri);
        assertEquals(null, document);
    }

}