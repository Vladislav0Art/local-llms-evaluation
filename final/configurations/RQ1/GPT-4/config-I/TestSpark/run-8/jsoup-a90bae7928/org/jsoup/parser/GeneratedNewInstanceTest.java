package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        TreeBuilder newInstance = treeBuilder.newInstance();
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

}