package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParse_NullInput {

    @Test
    public void initialiseParse_NullInput() throws Exception {
        Reader input = null;
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertThrows(NullPointerException.class, () -> treeBuilder.initialiseParse(input, "", null));
    }

}