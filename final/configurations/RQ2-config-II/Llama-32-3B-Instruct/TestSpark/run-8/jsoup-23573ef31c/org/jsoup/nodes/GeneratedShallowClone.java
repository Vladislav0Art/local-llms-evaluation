package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedShallowClone {

    @Test
    public void shallowClone() {
        Document document = Jsoup.parse("<html><body>Hello World!</body></html>");
        Document clone = document.shallowClone();
        assertNotNull(clone);
        assertTrue(clone.outerHtml().equals(document.outerHtml()));
    }
}

class FormElement extends Element {

}

class OutputSettings {

}

class QuirksMode {
}

}