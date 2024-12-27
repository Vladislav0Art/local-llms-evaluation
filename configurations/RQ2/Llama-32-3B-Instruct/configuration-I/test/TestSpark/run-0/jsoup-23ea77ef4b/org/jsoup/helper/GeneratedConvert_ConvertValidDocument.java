package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_ConvertValidDocument {

    @Test
    public void convert_ConvertValidDocument() {
        Document validDoc = org.jsoup.nodes.Document.parse("<div>Hello World!</div>");
        Document convertedDoc = W3CDom.convert(validDoc);
        org.jsoup.nodes.Document expectedDoc = org.jsoup.nodes.Document.parse("<div xmlns='http://www.w3.org/1999/xhtml'></div>");
        assert convertedDoc.html().equals(expectedDoc.html());
    }

}