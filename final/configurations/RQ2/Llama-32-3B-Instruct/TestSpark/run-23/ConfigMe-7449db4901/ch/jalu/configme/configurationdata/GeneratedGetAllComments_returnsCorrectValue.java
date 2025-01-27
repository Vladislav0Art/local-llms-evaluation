package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedGetAllComments_returnsCorrectValue {

    @Test
    public void getAllComments_returnsCorrectValue() {
        Map<String, List<String>> comments = new HashMap<>();
        String path1 = "key1";
        List<String> commentLines = Arrays.asList("line1", "");
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment(path1, commentLines);
        assertThat(config.getAllComments().get(path1), is(Collections.unmodifiableList(commentLines)));
    }

}