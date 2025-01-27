package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Appendable;

public class GeneratedTestAppendableAppend {

    @Test
    public void testAppendableAppend() throws IOException {
        Appendable appendable = new StringBuilder();
        appendable.append("Hello");
        assertEquals("Hello", appendable.toString());
    }

}