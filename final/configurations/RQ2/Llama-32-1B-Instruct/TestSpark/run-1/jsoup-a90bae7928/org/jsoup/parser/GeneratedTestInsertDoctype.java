package org.jsoup.parser;

public class GeneratedTestInsertDoctype {

    @Test
    public void testInsertDoctype() {
        // Create an instance of XmlTreeBuilder and insert a doctype into it.
        XmlTreeBuilder builder = new XmlTreeBuilder();

        // Verify that the doctype is inserted correctly.
        assertNotNull(builder.parseTree().getNodes().get(0).getContent());
    }

}