package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldReturnCommentDataAsXmlDeclarationIfCorrect {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void shouldReturnCommentDataAsXmlDeclarationIfCorrect() {
        // Given:
        String data = "!";
        when(accum.append(anyString())).thenReturn(this.accum);

        Comment comment = new Comment(data);
        XmlDeclaration result = comment.asXmlDeclaration();

        // Then:
        assertThat(result, is(null));
    }

}