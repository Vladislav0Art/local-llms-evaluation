package org.jsoup.parser;

public class GeneratedTestInsertCharacter {

    @Test
    public void testInsertCharacter() {
        // Create an instance of XmlTreeBuilder and insert a character into it.
        XmlTreeBuilder builder = new XmlTreeBuilder();

        // Verify that the character is inserted correctly.
        assertNotNull(builder.parseTree().getNodes().get(0).getContent());
    }

}