package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedShouldNotSetCommentForNonExistentPath {

    @Test
    public void shouldNotSetCommentForNonExistentPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        when(commentsConfig.comments).thenReturn(new HashMap<>());
        commentsConfig.setComment("", commentLines);
        assertThat(commentsConfig.comments, is(Collections.emptyMap()));
    }

}