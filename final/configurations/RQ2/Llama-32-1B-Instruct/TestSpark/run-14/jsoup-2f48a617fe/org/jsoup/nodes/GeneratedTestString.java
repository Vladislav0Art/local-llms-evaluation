package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestString {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public boolean isXmlDeclaration() throws IOException {
        return this.text == null || !this.text.isEmpty();
    }
}

public class GeneratedTest {

    @Test
    public void testString() throws IOException {
        Document doc = Jsoup.parse("This is an example string");
        Element comment1 = new Comment();
        doc.selectFirst(".example").first().addChild(comment1);
        assertEquals("This is a sample comment.", comment1.getData());
    }

}