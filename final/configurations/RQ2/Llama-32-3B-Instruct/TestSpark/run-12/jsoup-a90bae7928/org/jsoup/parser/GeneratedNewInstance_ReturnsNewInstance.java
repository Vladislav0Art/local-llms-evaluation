package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedNewInstance_ReturnsNewInstance {

    @Test
    public void NewInstance_ReturnsNewInstance() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = treeBuilder.newInstance();
        assertNotNull(newInstance);
        assertNotSame(treeBuilder, newInstance);
    }

}