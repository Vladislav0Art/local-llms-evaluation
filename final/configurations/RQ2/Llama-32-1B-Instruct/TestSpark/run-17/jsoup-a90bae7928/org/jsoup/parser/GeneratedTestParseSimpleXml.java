package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseSimpleXml {

    @Test
    public void testParseSimpleXml() throws Exception {
        String inputString = "<root><a/></root>";
        String baseUri = "";
        Reader reader = new StringReader(inputString);
        Document document = new XmlTreeBuilder().parse(reader, baseUri);
        assertNotNull(document);
    }

}