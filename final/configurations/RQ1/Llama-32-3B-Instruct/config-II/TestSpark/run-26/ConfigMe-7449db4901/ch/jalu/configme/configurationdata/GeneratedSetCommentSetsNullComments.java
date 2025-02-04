package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedSetCommentSetsNullComments {

    @Test
    public void setCommentSetsNullComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        null
        try {
            commentsConfig.setComment(path, null, null);
            assertThat(false, is(true));
        } catch (NullPointerException e) {
            // Expected
        }
    }

}