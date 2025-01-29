package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestOuterHtmlTail {

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
    public void testOuterHtmlTail() throws IOException {
        Document doc = Jsoup.parse("This is the end of the string");
        Comment comment1 = new Comment();
        doc.selectFirst(".example").first().addChild(comment1);
        assertEquals("<example><sample>test</sample></example>", comment1.outerHtml(0, null));
    }

}