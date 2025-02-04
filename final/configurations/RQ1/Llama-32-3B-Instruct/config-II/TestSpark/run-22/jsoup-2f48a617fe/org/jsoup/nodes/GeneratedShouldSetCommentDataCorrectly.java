package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldSetCommentDataCorrectly {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

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

}