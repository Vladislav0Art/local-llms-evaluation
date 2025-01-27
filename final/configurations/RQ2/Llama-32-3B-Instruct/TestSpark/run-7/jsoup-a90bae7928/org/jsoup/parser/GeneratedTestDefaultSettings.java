package org.jsoup.parser;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.io.Reader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedTestDefaultSettings {

    private static final String XML_INPUT = "<root><person><name>John</name></person></root>";
    private static final String BASE_URI = "http://example.com";

    @BeforeClass
    public static void init() {
        // Initialize the settings and parser for testing purposes.
    }

    @Mock
    protected Parser parser;

    @Test
    public void testDefaultSettings() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = treeBuilder.defaultSettings();

        assertNotNull(settings);
    }

}