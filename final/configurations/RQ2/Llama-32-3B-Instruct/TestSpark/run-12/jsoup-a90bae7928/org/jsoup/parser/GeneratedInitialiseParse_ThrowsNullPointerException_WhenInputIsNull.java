package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedInitialiseParse_ThrowsNullPointerException_WhenInputIsNull {

    @Test
    public void InitialiseParse_ThrowsNullPointerException_WhenInputIsNull() throws IOException {
        String input = "input";
        Reader reader = null;
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertThrows(NullPointerException.class, () -> treeBuilder.initialiseParse(reader, null, null));
    }

}