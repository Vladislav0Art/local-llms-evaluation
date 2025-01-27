package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedSetComment_setsCorrectValue {

    @Test
    public void setComment_setsCorrectValue() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "key1";
        List<String> commentLines = Arrays.asList("line1", "");
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment(path, commentLines);
        assertThat(config.getAllComments().get(path), is(Collections.unmodifiableList(commentLines)));
    }

}