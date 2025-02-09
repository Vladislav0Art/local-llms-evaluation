package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestForms {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private OutputSettings outputSettings;

    @Mock
    private QuirksMode quirksMode;

    private Document document;

    @Before
    public void setup() {
        document = new Document("https://www.example.com");
        document.parser(parser);
        document.connection(connection);
        document.outputSettings(outputSettings);
        document.quirksMode(quirksMode);
    }

    public String createShell(String baseUri) {
        return "shell";
    }

    @Test
    public void testForms() {
        List<FormElement> forms = document.forms();
        Mockito.when(parser.parse(Mockito.any(String.class))).thenReturn(forms);
        assertEquals(forms, document.forms());
    }

}