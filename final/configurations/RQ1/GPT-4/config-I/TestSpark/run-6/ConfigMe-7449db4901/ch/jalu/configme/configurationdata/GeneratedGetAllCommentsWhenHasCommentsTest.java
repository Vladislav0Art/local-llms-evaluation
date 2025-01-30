package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedGetAllCommentsWhenHasCommentsTest {

    @Test
    public void getAllCommentsWhenHasCommentsTest() {
        // given
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path = "test.path";
        List<String> commentLines = Arrays.asList("Line 1", "Line 2");
        commentsMap.put(path, commentLines);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);

        // when
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // then
        assertThat(allComments.size(), is(1));
        assertThat(allComments.keySet(), is(commentsMap.keySet()));
        assertThat(allComments.values(), is(commentsMap.values()));
    }

}