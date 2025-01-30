package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void NewInstanceTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        assertNotNull(testObject.newInstance());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(treeBuilder.newInstance());
    }

    @Test
    public void parseFragmentTest() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> nodes = treeBuilder.parseFragment("<fruit>Apple</fruit>", "Base url.", Parser.xmlParser());
        Document expected = Parser.xmlParser().parseInput("<fruit>Apple</fruit>", "Base url.");
        assertEquals(expected.child(0).outerHtml(), nodes.get(0).outerHtml());
    }

    @Test
    public void parseFragmentWithContextTest() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = new Document("Base url.");
        Element context = document.appendElement("tree");
        List<Node> nodes = treeBuilder.parseFragment("<fruit>Apple</fruit>", context, "Base url.", Parser.xmlParser());
        Document expected = Parser.xmlParser().parseInput("<fruit>Apple</fruit>", "Base url.");
        assertEquals(expected.child(0).outerHtml(), nodes.get(0).outerHtml());
    }

    @Test
    public void parseTest() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse("<test>Test Content</test>", "Base url.");
        assertEquals("<test>Test Content</test>", doc.body().html());
    }

    @Test
    public void parseInputXmlTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Document xmlDoc = Jsoup.parse("<tag><subTag>Test content</subTag></tag>", "", Parser.xmlParser());
        assertEquals("<tag><subTag>Test content</subTag></tag>", xmlDoc.toString());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Parser parser = new Parser(testObject);
        List<org.jsoup.nodes.Node> nodes = parser.parseFragment("<tag>Test content</tag>",
                new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf("html"), ""), "");
        assertEquals("<tag>Test content</tag>", nodes.get(0).toString());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        assertNotNull(testObject.newInstance());
    }

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        assertEquals("attr", testObject.defaultSettings().normalizeAttribute("Attr"));
    }

    @Test
    public void parseInputXmlTest() {
        Document xmlDoc = Jsoup.parse("<tag><subTag>Test content</subTag></tag>", "", Parser.xmlParser());
        assertEquals("<tag>\n <subTag>Test content</subTag>\n</tag>", xmlDoc.toString());
    }

    @Test
    public void newInstanceTest() {
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        TreeBuilder newInstance = treeBuilder.newInstance();
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings parseSettings = xmlTreeBuilder.defaultSettings();

        Class<?> innerClass = ParseSettings.class;

        final Field[] fields = innerClass.getDeclaredFields();
        for (Field field : fields) {
            if (Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getName().equalsIgnoreCase("preserveCase")) {
                        assertEquals(parseSettings, field.get(null));
                    }
                } catch (IllegalAccessException e) {
                    fail(e.getMessage());
                }
            }
        }
    }

}