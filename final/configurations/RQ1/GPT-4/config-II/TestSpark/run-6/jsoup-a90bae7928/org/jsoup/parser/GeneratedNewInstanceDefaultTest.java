package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNewInstanceDefaultTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void newInstanceDefaultTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.newInstance() instanceof XmlTreeBuilder);
    }

}