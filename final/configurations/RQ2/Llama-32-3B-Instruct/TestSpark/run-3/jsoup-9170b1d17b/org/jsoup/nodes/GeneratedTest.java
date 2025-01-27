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

public class GeneratedTest {

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
    public void getMethod_ReturnsNotNullValueForNotNullKey() {
        Attributes attrs = createAttributes(Collections.singletonMap(KEY, VALUE));
        assertEquals(VALUE, attrs.get(KEY));
    }

    @Test
    public void getUserDataMethod_ReturnsNullValueForKey() {
        Attributes attrs = new Attributes();
        assertNull(attrs.getUserData(null));
    }

    @Test
    public void putMethod_PutsValueForNotNullKey() {
        Attributes attrs = createAttributes(Collections.singletonMap(KEY, VALUE));
        Attribute attribute = new Attribute(KEY, VALUE);
        attrs.put(attribute);
        assertTrue(attrs.hasDeclaredValueForKey(KEY));
    }

    @Test
    public void addMethod_AddsValueForNotNullKey() {
        Attributes attrs = new Attributes();
        Attribute attribute = new Attribute(KEY, VALUE);
        attrs.add(KEY, VALUE);
        assertTrue(attrs.hasDeclaredValueForKey(KEY));
    }

    @Test
    public void putUserDataMethod_PutsValueForNotNullKey() {
        Attributes attrs = createAttributes(Collections.singletonMap(KEY, VALUE));
        Object value = "newValue";
        attrs.putUserData(KEY, value);
        assertEquals(value, attrs.getUserData(KEY));
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

    @Test
    public void sizeMethod_ReturnsCorrectSize() {
        Attributes attrs = createAttributes(Collections.singletonMap(KEY, VALUE));
        assertEquals(1, attrs.size());
    }

    @Test
    public void hasKeyMethod_ReturnsTrueForNotNullKey() {
        Attributes attrs = createAttributes(Collections.singletonMap(KEY, VALUE));
        assertTrue(attrs.hasKey(KEY));
    }

    @Test
    public void hasKeyIgnoreCaseMethod_ReturnsTrueForNotNullKey() {
        Attributes attrs = createAttributes(Collections.singletonMap(KEY, VALUE));
        assertTrue(attrs.hasKeyIgnoreCase(KEY));
    }

    @Test
    public void removeMethod_RemovesValueForNotNullKey() {
        Attributes attrs = createAttributes(Collections.singletonMap(KEY, VALUE));
        attrs.remove(KEY);
        assertFalse(attrs.hasDeclaredValueForKey(KEY));
    }

    @Test
    public void normalizeMethod_NormalizesValues() throws IOException {
        Attributes attrs = new Attributes();
        attrs.add(KEY, "  value  ");
        docs.normalize(attrs);
        assertEquals("value", attrs.get(KEY));
    }

}