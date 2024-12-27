package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_ConvertInvalidDocument {

    @Test
    public void convert_ConvertInvalidDocument() {
        Document invalidDoc = Mockito.mock(Document.class);
        assert W3CDom.convert(invalidDoc) == null;
    }

}