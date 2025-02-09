package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclarationShouldReturnExpectedObject {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void asXmlDeclarationShouldReturnExpectedObject() {
        XmlDeclaration expectedDeclaration = mock(XmlDeclaration.class);
        Mockito.when(comment.data).thenReturn("data");
        Comment comment = new Comment("data");
        Comment actualDeclaration = comment.asXmlDeclaration();
        assertEquals(expectedDeclaration, actualDeclaration);
    }

}