package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclarationTestWithEmptyData {

    @Test
    public void asXmlDeclarationTestWithEmptyData() {
        XmlDeclaration xmlDeclaration = Mockito.mock(XmlDeclaration.class);
        Comment comment = new Comment("");
        Comment asXmlDeclaration = comment.asXmlDeclaration();
        assertNotEquals(null, asXmlDeclaration);
    }

}