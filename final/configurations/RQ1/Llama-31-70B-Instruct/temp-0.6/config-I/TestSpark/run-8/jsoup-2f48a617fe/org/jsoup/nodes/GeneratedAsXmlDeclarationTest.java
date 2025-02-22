package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclarationTest {

    @Mock
    private Comment comment;

    @Test
    public void asXmlDeclarationTest() {
        comment = new Comment("test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("test", xmlDeclaration.getName());
        assertEquals(false, xmlDeclaration.isSelfClosing());
    }

}