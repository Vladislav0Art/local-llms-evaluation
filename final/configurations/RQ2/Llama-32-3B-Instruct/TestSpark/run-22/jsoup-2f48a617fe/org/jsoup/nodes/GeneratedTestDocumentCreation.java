package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestDocumentCreation {

    @Test
    public void testDocumentCreation() {
        Document document = new Document("<html><body>Hello, World!</body></html>");
        assertThat(document.outerHtml(), is("<!-- <html><body>Hello, World!</body></html> -->"));
    }

}