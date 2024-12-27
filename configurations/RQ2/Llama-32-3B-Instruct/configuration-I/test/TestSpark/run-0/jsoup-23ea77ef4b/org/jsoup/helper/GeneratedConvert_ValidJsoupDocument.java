package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_ValidJsoupDocument {

    @Test
    public void convert_ValidJsoupDocument() {
        Document validDoc = Mockito.mock(Document.class);
        Document convertedDoc = W3CDom.convert(validDoc);
        assert convertedDoc != null;
    }

}