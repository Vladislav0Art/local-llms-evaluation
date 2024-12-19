package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testAsXmlDeclaration() throws IOException {
        XmlDeclaration expected = new XmlDeclaration("UTF-8", "XML Declaration", "");
        Comment commentWithExpected = (Comment) comment.asXmlDeclaration();
        assertNotNull(commentWithExpected);
        assertEquals(expected, commentWithExpected);
        // check that the comment is not immediately followed by another
    }

}