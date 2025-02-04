package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void shouldCreateCommentWithCorrectData() {
        // Given:
        String data = "This is a comment";
        when(accum.append(anyString())).thenReturn(this.accum);

        // When:
        Comment comment = new Comment(data);

        // Then:
        assertThat(comment.value, is(data));
        assertThat(comment.nodeName(), is("#comment"));
    }

    @Test
    public void shouldReturnCommentDataCorrectly() {
        // Given:
        String data = "This is a comment";

        // When:
        when(accum.append(anyString())).thenReturn(this.accum);

        Comment comment = new Comment(data);
        String result = comment.getData();

        // Then:
        assertThat(result, is("This is a comment"));
    }

    @Test
    public void shouldSetCommentDataCorrectly() {
        // Given:
        String data = "This is a comment";
        when(accum.append(anyString())).thenReturn(this.accum);

        Comment comment = new Comment(data);
        Comment result = comment.setData(data);

        // Then:
        assertThat(result, is(comment));
    }

    @Test
    public void shouldReturnOuterHtmlCorrectly() {
        // Given:
        String data = "This is a comment";
        when(accum.append(anyString())).thenReturn(this.accum);
        when(out.prettyPrint()).thenReturn(true);

        Comment comment = new Comment(data);
        Appendable result = comment.outerHtmlHead(accum, 0, out);

        // Then:
        assertThat(result.toString(), is("<!-- This is a comment -->"));
    }

    @Test
    public void shouldNotReturnOuterHtmlCorrectlyIfNotPrettyPrint() {
        // Given:
        String data = "This is a comment";
        when(accum.append(anyString())).thenReturn(this.accum);
        when(out.prettyPrint()).thenReturn(false);

        Comment comment = new Comment(data);
        Appendable result = comment.outerHtmlHead(accum, 0, out);

        // Then:
        assertThat(result.toString(), is(""));
    }

    @Test
    public void shouldReturnCommentDataAsString() {
        // Given:
        String data = "This is a comment";

        // When:
        Comment comment = new Comment(data);
        String result = comment.getData();

        // Then:
        assertThat(result, is("This is a comment"));
    }

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

    @Test
    public void shouldReturnCommentDataAsXmlDeclarationIfNotCorrect() {
        // Given:
        String data = "!";
        when(accum.append(anyString())).thenReturn(this.accum);

        Comment comment = new Comment(data);
        XmlDeclaration result = comment.asXmlDeclaration();

        // Then:
        assertThat(result, is(null));
    }

}