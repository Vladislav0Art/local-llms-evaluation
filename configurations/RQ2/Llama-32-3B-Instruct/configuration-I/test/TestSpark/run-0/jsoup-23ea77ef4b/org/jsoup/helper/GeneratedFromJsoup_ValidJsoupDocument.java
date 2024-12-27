package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFromJsoup_ValidJsoupDocument {

    @Test
    public void fromJsoup_ValidJsoupDocument() {
        Document validDoc = Mockito.mock(Document.class);
        Document convertedDoc = W3CDom.fromJsoup(validDoc);
        assert convertedDoc != null;
    }

}