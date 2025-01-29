package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestConvert {

    @Test
    public void testConvert() {
        W3CDom doc = new W3CDom();
        Document document = new org.jsoup.nodes.Document();
        doc.convert(document);

        org.jsoup.nodes.Document convertedDocument = new org.jsoup.nodes.Document();
        assertSame(convertedDocument, doc.convert(document));
    }

}