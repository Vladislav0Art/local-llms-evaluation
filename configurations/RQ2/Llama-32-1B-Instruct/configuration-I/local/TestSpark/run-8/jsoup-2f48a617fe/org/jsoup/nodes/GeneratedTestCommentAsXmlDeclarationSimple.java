package org.jsoup.nodes;

public class GeneratedTestCommentAsXmlDeclarationSimple {


    private Comment comment;

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentAsXmlDeclarationSimple() {
        String data = "<!ELEMENT example (#PCDATA)>\n<example>Example text</example>";
        comment = new Comment(data);
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}