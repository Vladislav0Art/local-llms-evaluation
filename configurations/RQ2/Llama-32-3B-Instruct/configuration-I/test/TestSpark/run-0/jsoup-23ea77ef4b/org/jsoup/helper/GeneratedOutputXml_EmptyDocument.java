package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOutputXml_EmptyDocument {

    @Test
    public void OutputXml_EmptyDocument() {
        Document emptyDoc = Mockito.mock(Document.class);
        HashMap<String, String> result = W3CDom.OutputXml(emptyDoc);
        assert result == null;
    }

}