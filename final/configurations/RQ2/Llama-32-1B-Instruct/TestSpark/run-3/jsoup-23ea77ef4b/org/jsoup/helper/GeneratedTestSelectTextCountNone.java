package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestSelectTextCountNone {

    @Test
    public void testSelectTextCountNone() {
        String html = "<html><body></body></html>";
        Document doc = neworg.w3c.dom.Document();
        doc.appendChild(neworg.w3c.dom.Element("html"));
        doc.appendChild(neworg.w3c.dom.Element(""));
        String xpath = "p";
        org.w3c.dom.Node element = doc.selectXPath(xpath).firstChild;
        assertThat(element.getTextContent().size(), is(0));
    }

}