package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedGetAllComments_returnsCorrectValue_multiplePaths {

    @Test
    public void getAllComments_returnsCorrectValue_multiplePaths() {
        Map<String, List<String>> comments = new HashMap<>();
        String path1 = "key1";
        String path2 = "key2";
        List<String> commentLines = Arrays.asList("line1", "", "line3");
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment(path1, commentLines);
        config.setComment(path2, Arrays.asList("line4"));
        assertThat(config.getAllComments().get(path1), is(Collections.unmodifiableList(commentLines)));
        assertThat(config.getAllComments().get(path2), is(Arrays.asList("line4")));
    }

}