package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        TreeBuilder newInstance = builder.newInstance();

        assertNotNull(newInstance);
    }

}