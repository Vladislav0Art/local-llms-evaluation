package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclarationTestWithData {

    @Test
    public void asXmlDeclarationTestWithData() {
        String data = "data";
        XmlDeclaration xmlDeclaration = Mockito.mock(XmlDeclaration.class);
        Comment comment = new Comment(data);
        Comment asXmlDeclaration = comment.asXmlDeclaration();
        // Some data to render
    }

}