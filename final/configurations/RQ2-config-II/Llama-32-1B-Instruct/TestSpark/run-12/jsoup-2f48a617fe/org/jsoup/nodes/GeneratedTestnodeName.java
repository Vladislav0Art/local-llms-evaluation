package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private Document document;
    private ParseSettings parseSettings;

    @Test
    public void testnodeName() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

}