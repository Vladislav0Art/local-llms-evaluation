package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        TreeBuilder newBuilder = builder.newInstance();
        assertNotNull(newBuilder);
        assertTrue(newBuilder instanceof XmlTreeBuilder);
    }

}