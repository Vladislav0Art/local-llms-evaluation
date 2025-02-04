package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedSetComment_setsEmptyLinesForPath {

    @Test
    public void setComment_setsEmptyLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String commentLine1 = "\n";
        String commentLine2 = "comment2\n";
        commentsConfig.setComment(path, commentLine1, commentLine2);
        assertThat(commentsConfig.getAllComments().get(path), is(Arrays.asList(commentLine1, commentLine2)));
    }

}