package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    public static String parse(String xml) {
        return Jsoup.parse(xml).toString();
    }

    @Test
    public void testParse() {
        String xml = "<root><person id='1'><name>John Doe</name></person></root>";
        Document doc = parser.parse(xml);
        assertTrue(doc.html().equals("<root><person id='1'><name>John Doe</name></person></root>"));
    }

    @Test
    public void testParseWithUri() {
        String xml = "<root><person id='1'><name>John Doe</name></person></root>";
        Document doc = parser.parse(xml);
        assertTrue(doc.html().equals("<root><person id='1'><name>John Doe</name></person></root>"));
    }

    @Test
    public void testParseEmpty() {
        String xml = "";
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

    @Test
    public void testParseWithEmptyUri() {
        String xml = "<root><person id='1'><name>John Doe</name></person></root>";
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

    @Test
    public void testParseWithNullUri() {
        String xml = "<root><person id='1'><name>John Doe</name></person></root>";
        try {
            parser.parse(null);
        } catch (Exception e) {
        }
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

    @Test
    public void testParseWithNullName() {
        String xml = "<root><person id='1'><name>John Doe</name></person></root>";
        try {
            parser.parse(xml);
        } catch (Exception e) {
        }
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

    @Test
    public void testParseWithNullPersonId() {
        String xml = "<root><person><id>1</id></person></root>";
        try {
            parser.parse(xml);
        } catch (Exception e) {
        }
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

    @Test
    public void testParseWithNullPersonName() {
        String xml = "<root><person><name>John Doe</name></person></root>";
        try {
            parser.parse(xml);
        } catch (Exception e) {
        }
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

}