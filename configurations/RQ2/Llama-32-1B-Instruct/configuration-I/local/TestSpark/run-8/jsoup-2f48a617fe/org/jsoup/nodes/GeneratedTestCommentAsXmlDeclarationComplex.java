package org.jsoup.nodes;

public class GeneratedTestCommentAsXmlDeclarationComplex {


    private Comment comment;

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentAsXmlDeclarationComplex() {
        String data = "<!ELEMENT example (#PCDATA)>\n<example>Example text\n  <grandchild>Grandchild</grandchild></example>";
        comment = new Comment(data);
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}