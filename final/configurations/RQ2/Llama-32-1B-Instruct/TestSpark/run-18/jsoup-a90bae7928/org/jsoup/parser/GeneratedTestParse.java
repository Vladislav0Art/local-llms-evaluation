package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParse {

    @Test
    public void testParse() {
        Element element = createElement("root", new String[]{"attr1", "attr2"}, null);
        Mockito.when(element.getAttributes().get("attr1").getValue()).thenReturn("value1");
        Mockito.when(element.getAttributes().get("attr2").getValue()).thenReturn("value2");
        Document document = new XmlTreeBuilder(new ParseSettings(), element, null).parse(new StringReader("<root><child>text</child></root>", baseUri));
    }

}