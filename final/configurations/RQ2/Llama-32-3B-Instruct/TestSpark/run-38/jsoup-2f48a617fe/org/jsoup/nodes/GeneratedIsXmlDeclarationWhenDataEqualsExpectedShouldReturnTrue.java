package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclarationWhenDataEqualsExpectedShouldReturnTrue {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void isXmlDeclarationWhenDataEqualsExpectedShouldReturnTrue() {
        XmlDeclaration expectedDeclaration = mock(XmlDeclaration.class);
        Mockito.when(comment.data).thenReturn("expected data");
        Comment comment = new Comment("expected data");
        assertTrue(comment.isXmlDeclaration());
    }
}

class Document {
    OutputSettings out;

    public void documentBuilderMock() throws IOException {
    }
}

class Appendable implements Appendable {
    @Override
    public void append(String content) {
    }

    public void appendableMock() {
    }

    @Override
    public String toString() {
        return "";
    }
}

class XmlDeclaration {
    // no implementation needed

    public static class mock extends XmlDeclaration {
    }

}