package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<html></html>"), "http://example.com", new Parser(treeBuilder));
        assertNotNull(treeBuilder.getStack());
    }

}