package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void getNotNull_Scenario() {
        Attributes attrs = new Attributes();
        assertEquals("key", Attributes.checkNotNull(null));
    }

    @Test
    public void getNotNull_ScenarioWithValue() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertEquals("value", (String) attrs.get("key"));
    }

    @Test
    public void getIgnoreCaseNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("KEY", "value");
        assertEquals("value", (String) attrs.getIgnoreCase("KEY"));
    }

    @Test
    public void getUserDataNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.putUserData("key", "value");
        assertNotNull(attrs.getUserData("key"));
    }

    @Test
    public void addNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertEquals(1, attrs.size());
    }

    @Test
    public void putNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", (String) attrs.get("key"));
    }

    @Test
    public void removeNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertTrue(attrs.hasKey("key"));
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void hasKeyNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.add("key", null);
        assertTrue(attrs.hasKey("key"));
    }

    @Test
    public void putAllNotNull_Scenario() {
        Attributes attrs = new Attributes();
        Attributes attrs2 = new Attributes();
        attrs.addAll(attrs2);
        assertEquals(2, attrs.size());
    }

    @Test
    public void htmlNotNull_Scenario() throws Exception {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Appendable accum = new java.io.StringWriter();
        Document.OutputSettings out = new Document.OutputSettings();
        attrs.html(accum, out);
        String expected = "<span key=\"key\">value</span>";
        assertEquals(expected, accum.toString());
    }

}