package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_InvalidJsoupDocumentWithAttributes {

    @Test
    public void convert_InvalidJsoupDocumentWithAttributes() {
        Document invalidDoc = Mockito.mock(Document.class);
        Map<String, String> attributes = new HashMap<>();
        attributes.put("attr1", "val1");
        attributes.put("attr2", "val2");
        assert W3CDom.convert(invalidDoc, attributes) == null;
    }

}