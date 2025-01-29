package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestComment {

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
    public void testComment() throws IOException {
        Document doc = Jsoup.parse("<example><sample>test</sample></example>");
        Element comment1 = new Comment();
        doc.selectFirst(".example").first().addChild(comment1);
        assertEquals(true, comment1.isXmlDeclaration());

        String outerHtml = comment1.outerHtml(0, null);
        assertEquals("This is a sample comment.", outerHtml);
    }

}