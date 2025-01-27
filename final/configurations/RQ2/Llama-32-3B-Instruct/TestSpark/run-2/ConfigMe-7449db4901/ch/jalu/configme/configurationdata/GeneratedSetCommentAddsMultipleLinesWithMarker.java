package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentAddsMultipleLinesWithMarker {

    @Test
    public void setCommentAddsMultipleLinesWithMarker() {
        // given
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);

        String path = "path";
        String[] commentLines = {"comment line 1", "comment line 2"};

        // when
        commentsConfig.setComment(path, commentLines);

        // then
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertThat(allComments.get(path), is(Arrays.asList(commentLines)));
    }

}