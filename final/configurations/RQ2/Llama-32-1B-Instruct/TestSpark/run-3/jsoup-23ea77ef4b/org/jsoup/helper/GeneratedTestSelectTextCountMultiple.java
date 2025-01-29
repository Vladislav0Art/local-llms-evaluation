package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestSelectTextCountMultiple {

    @Test
    public void testSelectTextCountMultiple() {
        String html = "<html><body><p>Test</p></body></html>";
        Document doc = neworg.w3c.dom.Document();
        doc.appendChild(neworg.w3c.dom.Element("html"));
        doc.appendChild(neworg.w3c.dom.Element("body"));
        doc.appendChild(neworg.w3c.dom.Element("p"));
        String xpath = "p";
        org.w3c.dom.Node element = doc.selectXPath(xpath).firstChild;
        assertThat(element.getTextContent().size(), is(2));
    }

}