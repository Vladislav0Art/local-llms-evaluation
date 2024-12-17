package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNotCloningComments {

    @Test
    public void testNotCloningComments() {
        Document document = Jsoup.parse("<html><body><!-- This is a comment -->Hello World!</body></html>");
        Object clonedDocument = document.clone();
        assertFalse(clonedDocument.contains("#"));
    }
}

}