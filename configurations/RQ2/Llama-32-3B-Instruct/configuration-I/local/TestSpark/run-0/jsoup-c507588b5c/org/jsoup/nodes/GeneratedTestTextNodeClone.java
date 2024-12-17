package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

public class GeneratedTestTextNodeClone {

    @Test
    public void testTextNodeClone() throws IOException {
        String html = "<html><body>Hello World</body></html>";
        Jsoup soup = Jsoup.parse(html);
        TextNode clone = new TextNode(soup.body().text());

        assertEquals(clone, clone.clone());
    }
}

class TextNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextNode that = (TextNode) o;

        return text.equals(that.text);
    }

    public TextNode clone() {
        return new TextNode(text);
    }

}