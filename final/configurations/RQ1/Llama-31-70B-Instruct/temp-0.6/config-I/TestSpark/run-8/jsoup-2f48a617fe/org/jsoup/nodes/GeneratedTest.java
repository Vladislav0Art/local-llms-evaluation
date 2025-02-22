package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Comment comment;

    @Test
    public void setDataTest() {
        comment.setData("Test data");
        assertEquals("Test data", comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        comment = new Comment("!test");
        assertEquals(true, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        comment = new Comment("test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("test", xmlDeclaration.getName());
        assertEquals(false, xmlDeclaration.isSelfClosing());
    }

    @Test
    public void asXmlDeclarationTest2() {
        comment = new Comment("!test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(null, xmlDeclaration);
    }

}