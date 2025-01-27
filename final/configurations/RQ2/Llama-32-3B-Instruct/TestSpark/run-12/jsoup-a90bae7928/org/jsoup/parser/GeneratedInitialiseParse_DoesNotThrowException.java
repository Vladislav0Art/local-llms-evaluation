package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedInitialiseParse_DoesNotThrowException {

    @Test
    public void InitialiseParse_DoesNotThrowException() {
        String input = "";
        Reader reader = new StringReader(input);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertTrue(treeBuilder.initialiseParse(reader, null, null));
    }

}