package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserSettings;
import org.jsoup.nodes.UserAgentException;
import org.jsoup.parser.ParseSettings;
import org.jsoup.serialization.ParserConfigurationException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedHtmlMethod_ReturnsStringRepresentationOfHTML {

    private static final String KEY = "key";
    private static final String VALUE = "value";

    @BeforeClass
    public static void setup() {
        Document doc = new Document();
        Element element = doc.body().append(KEY).append(VALUE);
        for (Attribute attribute : element.attributes()) {
            doc.get().setAttributes(attribute);
        }
    }

    public static Attributes createAttributes(Map<String, String> attributes) {
        Attributes attrs = new Attributes();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            attrs.put(entry.getKey(), entry.getValue());
        }
        return attrs;
    }

    @Test
    public void htmlMethod_ReturnsStringRepresentationOfHTML() throws IOException {
        Attributes attrs = new Attributes();
        attrs.add(KEY, VALUE);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        docs.html(accum, out);
        assertTrue(accum.toString().contains("<" + KEY));
        assertTrue(accum.toString().contains(VALUE));
    }

}