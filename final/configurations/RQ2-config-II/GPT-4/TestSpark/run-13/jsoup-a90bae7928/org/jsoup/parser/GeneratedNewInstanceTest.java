package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        TreeBuilder newInstance = treeBuilder.newInstance();
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

}