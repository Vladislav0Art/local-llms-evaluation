package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedSetCommentSetsNullPath {

    @Test
    public void setCommentSetsNullPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String nullPath = null;
        try {
            commentsConfig.setComment(nullPath, "comment1\n", "comment2\n");
            assertThat(false, is(true));
        } catch (NullPointerException e) {
            // Expected
        }
    }

}