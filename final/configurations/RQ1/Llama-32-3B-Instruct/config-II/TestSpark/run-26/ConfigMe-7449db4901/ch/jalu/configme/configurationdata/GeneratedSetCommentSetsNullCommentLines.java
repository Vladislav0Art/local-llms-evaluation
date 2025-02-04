package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedSetCommentSetsNullCommentLines {

    @Test
    public void setCommentSetsNullCommentLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String nullCommentLine1 = null;
        String commentLine2 = "comment2\n";
        try {
            commentsConfig.setComment(path, nullCommentLine1, commentLine2);
            assertThat(false, is(true));
        } catch (NullPointerException e) {
            // Expected
        }
    }

}