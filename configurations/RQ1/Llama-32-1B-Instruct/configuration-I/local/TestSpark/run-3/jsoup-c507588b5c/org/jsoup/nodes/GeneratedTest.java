package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testIsEmpty() {
        assertNull(createTextNode("").splitText(0).text());
        assertNull(createTextNode("   ").splitText(-1));
    }

    @Test
    public void testIsBlank() {
        assertTrue(createTextNode("a").blank());
        assertFalse(createTextNode(" a").blank(null));
    }

    @Test
    public void testSplitText_SingleCharacter() {
        TextNode text = createTextNode("a");
        assertNotNull(text.splitText(0).text());
    }

    @Test
    public void testSplitText_EmptyString() {
        TextNode text = new TextNode("");
        assertNull(text.splitText(-1));
    }

    @Test
    public void testSplitText_OneCharacterString() {
        TextNode text = createTextNode("a");
        assertNotNull(text.splitText(0).text());
    }

    @Test
    public void testSplitText_Whitespace() {
        TextNode text = new TextNode("   ");
        assertNotNull(text.splitText(-1));
    }

    @Test
    public void testSplitText_MultipleCharactersString() {
        TextNode text = createTextNode("hello world");
        assertNotNull(text.splitText(7).text());
    }

    @Test
    public void testOuterHtmlHead_NestedNodes() {
        Elements nodes = new Elements();
        Document doc = new Document();
        for (int i = 0; i < 10; i++) {
            Element element = new Element("div");
            node = createTextNode(String.valueOf(i));
            element.appendChild(node);
            nodes.add(element);
        }
        doc.appendChild(nodes);
        TextNode text = createTextNode(doc.body().text());
        System.out.println(text.text());
    }

    @Test
    public void testOuterHtmlTail_NestedNodes() {
        Elements nodes = new Elements();
        Document doc = new Document();
        for (int i = 0; i < 10; i++) {
            Element element = new Element("div");
            node = createTextNode(String.valueOf(i));
            element.appendChild(node);
            nodes.add(element);
        }
        doc.appendChild(nodes);
        TextNode text = createTextNode(doc.body().text());
        System.out.println(text.text());
    }

}