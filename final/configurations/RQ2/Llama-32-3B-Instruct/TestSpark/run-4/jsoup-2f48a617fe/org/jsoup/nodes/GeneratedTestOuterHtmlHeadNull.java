package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlHeadNull {

    @Mock
    private Appendable appendable;

    public void setup() {
        when(appendable.print(anyString())).thenReturn(null);
    }

    @Test
    public void testOuterHtmlHeadNull() {
        Document node = new Document(null);

        // Arrange and Act
        when(comment.outerHtmlHead(any(), zeroOrMore(1), any())).thenReturn(null);
        appendable.print("someString");
        comment.write(appendable);

        // Assert
        assertNull(result);
    }

}