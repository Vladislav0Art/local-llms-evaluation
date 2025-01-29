package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseBaseUri {

    @Test
    public void testParseBaseUri() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(input);
        String baseUri = "http://example.com";
        Mockito.when(builder.defaultSettings().baseUri()).thenReturn(baseUri);
    }

}