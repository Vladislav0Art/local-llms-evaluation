package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentDoesNotAddNewLinesWithoutMarker {

    @Test
    public void setCommentDoesNotAddNewLinesWithoutMarker() {
        // given
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);

        String path = "path";
        String commentLine = "";

        // when
        commentsConfig.setComment(path, commentLine);

        // then
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertThat(allComments.get(path), is(Collections.singletonList(commentLine)));
    }

}