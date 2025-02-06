package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsSoleNewLineAsEmptyLine {

    @Test
    public void setCommentSetsSoleNewLineAsEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList(""));
        configuration.setComment("path", "", "");
        assertThat(configuration.getAllComments(), is(comments));
    }

}