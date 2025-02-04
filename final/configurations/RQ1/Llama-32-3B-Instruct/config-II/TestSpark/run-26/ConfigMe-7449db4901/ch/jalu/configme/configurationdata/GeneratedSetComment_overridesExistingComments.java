package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedSetComment_overridesExistingComments {

    @Test
    public void setComment_overridesExistingComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String existingCommentLine1 = "comment1\n";
        String commentLine2 = "comment2\n";
        commentsConfig.setComment(path, existingCommentLine1, commentLine2);
        assertThat(commentsConfig.getAllComments().get(path), is(Arrays.asList(commentLine2)));
    }

}