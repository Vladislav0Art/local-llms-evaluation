package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAppend_AppendElement {

    @Test
    public void append_AppendElement() {
        Element element = new Element();
        Elements elements = new Elements();
        elements.add(element);
        element.append(elements);
        assertNotNull(element.children().get(0));
    }

}