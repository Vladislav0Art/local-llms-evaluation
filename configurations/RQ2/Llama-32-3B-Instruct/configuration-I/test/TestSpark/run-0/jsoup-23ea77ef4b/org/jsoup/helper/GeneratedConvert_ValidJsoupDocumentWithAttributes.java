package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_ValidJsoupDocumentWithAttributes {

    @Test
    public void convert_ValidJsoupDocumentWithAttributes() {
        Document validDoc = org.jsoup.nodes.Document.parse("<div attr1='val1' attr2='val2'>Hello World!</div>");
        W3CDom.convert(validDoc);
    }

}