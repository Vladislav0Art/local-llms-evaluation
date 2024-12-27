package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private boolean isInserted;
    private boolean isErrorDisplayed;

    public void insertStartTag(Element element) {
        isInserted = true;
    }

    public boolean error(String message) {
        isErrorDisplayed = true;
        return false;
    }
}

public class Element {

    private String tag;

    public Element(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "<" + tag + ">";
    }
}

public class GeneratedTest {

    private HtmlTreeBuilder builder;
    private boolean isInserted;
    private boolean isErrorDisplayed;

    @Before
    public void setup() {
        builder = new HtmlTreeBuilder();
        isInserted = false;
        isErrorDisplayed = false;
    }

    @Test
    public void testDefaultSettings() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertNull(builder.defaultSettings());
    }

    @Test
    public void testNewInstance() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        assertSame(builder, builder.newInstance());
    }

}