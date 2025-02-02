package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class GeneratedTest {

    public List<String> getComments() {
        return Arrays.asList("line1", "line2");
    }

    public boolean isCommentsEmpty() {
        return this.getComments().isEmpty();
    }
}

public class GeneratedTest {

    @Mock
    private CommentsConfiguration commentsConfig;

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> allComments = comments.getAllComments();
        assertTrue(allComments instanceof java.util.Map);
        assertFalse(allComments instanceof java.util.List);
    }

}