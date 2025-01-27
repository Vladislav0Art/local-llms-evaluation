package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTestDocument {

    @Test
    public void testDocument() {
        Document document = new Document();
        String actualSettings = createDocument().getOutputSettings();
        when(document.getOutputSettings()).thenReturn("abc");

        Document expectedDocument = new PublicDocument();
        Elements elements = expectedDocument.select("*");
        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            if (i == 0) {
                element.attr("value", "def");
            }
            if (i == 1) {
                element.attr("type", "button");
            }
        }

        when(createDocument()).thenReturn(expectedDocument);

        String actualSetting = createDocument().getOutputSettings();
        assert actualSetting.equals("abc");

        actualSettings = createDocument().getOutputSettings();
        assert actualSetting.equals("abc");
    }

    public Document createDocument() {
        return new PublicDocument();
    }

}