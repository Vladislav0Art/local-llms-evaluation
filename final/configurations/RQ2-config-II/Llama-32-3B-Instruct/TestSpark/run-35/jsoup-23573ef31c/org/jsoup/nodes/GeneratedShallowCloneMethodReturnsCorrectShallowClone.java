package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedShallowCloneMethodReturnsCorrectShallowClone {

    @Test
    public void shallowCloneMethodReturnsCorrectShallowClone() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html).clone();
        assertNotNull(document.shallowClone());
    }

}