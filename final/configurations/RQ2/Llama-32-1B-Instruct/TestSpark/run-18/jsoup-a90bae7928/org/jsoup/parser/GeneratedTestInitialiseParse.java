package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInitialiseParse {

    @Test
    public void testInitialiseParse() {
        Mockito.mock(Readable, times(1));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        String input = "input";
        String baseUri = "http://example.com";
        Document document = xmlTreeBuilder.parse(input, baseUri);
    }

}