package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclarationTest2 {

    @Mock
    private Comment comment;

    @Test
    public void asXmlDeclarationTest2() {
        comment = new Comment("!test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(null, xmlDeclaration);
    }

}