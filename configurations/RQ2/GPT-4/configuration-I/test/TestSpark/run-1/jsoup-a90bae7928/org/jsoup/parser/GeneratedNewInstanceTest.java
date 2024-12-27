package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder instance = new XmlTreeBuilder().newInstance();
        assertNotNull(instance);
        assertTrue(instance instanceof XmlTreeBuilder);
    }

}