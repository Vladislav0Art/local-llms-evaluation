package org.jsoup.nodes;

public class GeneratedTestsetData {

    private Document document;
    private ParseSettings parseSettings;

    @Test
    public void testsetData() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}