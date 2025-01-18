package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder instance = builder.newInstance();

        assertNotNull(instance);
        assertNotSame(builder, instance);
    }

}