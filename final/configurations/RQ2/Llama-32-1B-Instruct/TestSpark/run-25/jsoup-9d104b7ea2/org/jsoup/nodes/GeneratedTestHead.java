package org.jsoup.nodes;

public class GeneratedTestHead {

    private String tag;

    public Document(String tag) {
        this.tag = tag;
    }

    public void setText(String text) {
        this.tag += " " + text;
    }

    @Override
    public String toString() {
        return "<" + tag + ">" + text + "</" + tag + "]";
    }
}

public class GeneratedTest {

    public Document body = new Document("html");
    public Document head = new Document("head");

    public Document createDocument(String tag) {
        return new Document(tag);
    }

    @Test
    public void testHead() {
        head.setText("");
        assertEquals("", head.toString());
    }

}