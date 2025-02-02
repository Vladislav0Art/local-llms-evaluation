package org.jsoup.nodes;

public class GeneratedTestEntitiesEscape {

    @Test
    public void testEntitiesEscape() throws Exception {
        String text = "&amp;lt;p&amp;gt;Hello &amp;lt;span&gt;World!&amp;lt;/span&gt;";
        TextNode node = new TextNode(text);
        assertEquals("&amp;lt;p&amp;gt;Hello &amp;lt;span&gt;World!&amp;lt;/span&gt;", node.toString());
    }

}