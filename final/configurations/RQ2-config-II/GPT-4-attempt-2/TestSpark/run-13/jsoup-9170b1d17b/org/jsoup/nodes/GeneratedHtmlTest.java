package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() throws IOException {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Appendable appendable = new StringBuilder();
        attributes.html(appendable, Mockito.mock(Document.OutputSettings.class));
        assertTrue(appendable.toString().contains("value"));
    }

}