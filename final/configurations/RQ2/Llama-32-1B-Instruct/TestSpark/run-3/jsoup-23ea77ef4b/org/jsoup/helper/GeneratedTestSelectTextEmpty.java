package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestSelectTextEmpty {

    @Test
    public void testSelectTextEmpty() {
        String html = "<html><body></body></html>";
        Document doc = neworg.w3c.dom.Document();
        try {
            doc.appendChild(neworg.w3c.dom.Element(""));
            org.w3c.dom.Node element = doc.selectXPath("p").firstChild;
            assertThat(element.getTextContent(), is(""));
        } catch (Exception e) {
        }

        String xpath = "p";
        org.w3c.dom.Node element = doc.selectXPath(xpath).firstChild;
        assertThat(element.getTextContent(), is(""));
    }

}