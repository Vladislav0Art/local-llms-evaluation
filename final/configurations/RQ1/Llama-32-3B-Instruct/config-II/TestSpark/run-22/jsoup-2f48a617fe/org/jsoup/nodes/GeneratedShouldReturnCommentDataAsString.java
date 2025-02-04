package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShouldReturnCommentDataAsString {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

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

}