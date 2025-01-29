package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestSetData {

    @Mock
    private Document document;

    @Before
    public void setup() {
        parseSettings = new ParseSettings();
    }

    @Test
    public void testSetData() {
        Document document = new Document();
        Element element = document.createElement("comment");
        element.setAttribute("data", "new_data");
        TestComment comment = new TestComment("comment data");
        element.appendChild(comment);
        assertEquals(element.getAttribute("data"), "new_data");
    }

    @Mock
    private ParseSettings parseSettings;

    @Before
    public void setupParseSettings() {
        parseSettings = new ParseSettings();
    }

    @After
    public void tearDown() {
        document = null;
    }

    public static class ParseSettings {
        public void setComments() {
        }
    }

    public void testGetComments() {
        TestComment comment1 = new TestComment("comment data");
        Document document = new Document();
        Element element = document.createElement("comment");
        element.appendChild(comment1);
        TestComment comment2 = new TestComment("comment data");
        document.appendChild(element);
        assertEquals(2, document.getElementById("comments").children().length);
    }

}