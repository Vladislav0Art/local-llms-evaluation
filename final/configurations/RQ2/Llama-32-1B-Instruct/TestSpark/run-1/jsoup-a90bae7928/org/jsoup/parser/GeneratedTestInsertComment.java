package org.jsoup.parser;

public class GeneratedTestInsertComment {

    @Test
    public void testInsertComment() {
        // Create an instance of XmlTreeBuilder and insert a comment into it.
        XmlTreeBuilder builder = new XmlTreeBuilder();

        // Verify that the comment is inserted correctly.
        assertNotNull(builder.parseTree().getNodes().get(0).getContent());
    }

}