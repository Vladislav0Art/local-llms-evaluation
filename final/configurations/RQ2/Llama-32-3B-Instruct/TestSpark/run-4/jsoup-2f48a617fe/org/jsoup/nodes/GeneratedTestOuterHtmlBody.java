package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlBody {

    @Mock
    private Appendable appendable;

    public void setup() {
        when(appendable.print(anyString())).thenReturn(null);
    }

    @Test
    public void testOuterHtmlBody() {
        String document = "someDocument";
        Document node = new Document(document);

        // Arrange and Act
        when(comment.outerHtmlHead(any(), zeroOrMore(1), any())).thenReturn(document);
        appendable.print("someString");
        comment.write(appendable);

        // Assert
        assertEquals(document, result);
    }

}