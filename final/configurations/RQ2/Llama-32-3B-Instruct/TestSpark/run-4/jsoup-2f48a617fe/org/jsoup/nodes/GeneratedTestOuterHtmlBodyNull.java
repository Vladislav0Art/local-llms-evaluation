package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlBodyNull {

    @Mock
    private Appendable appendable;

    public void setup() {
        when(appendable.print(anyString())).thenReturn(null);
    }

    @Test
    public void testOuterHtmlBodyNull() {
        Document node = new Document(null);

        // Arrange and Act
        when(comment.outerHtmlHead(any(), zeroOrMore(1), any())).thenReturn(null);
        appendable.print("someString");
        comment.write(appendable);

        // Assert
        assertNull(result);
    }
}

class Comment {
    public Appendable appendable;
    public String result;

    public void write(Appendable appendable) {
        this.appendable = appendable;
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public Document getData() {
        return new Document(null);
    }
}

class Document {
    public String value;

    public Document(String value) {
        this.value = value;
    }

}