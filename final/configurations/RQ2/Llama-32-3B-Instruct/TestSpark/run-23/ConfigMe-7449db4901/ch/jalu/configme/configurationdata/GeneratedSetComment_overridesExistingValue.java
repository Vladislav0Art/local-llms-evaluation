package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedSetComment_overridesExistingValue {

    @Test
    public void setComment_overridesExistingValue() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "key1";
        List<String> existingCommentLines = Arrays.asList("existingLine");
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment(path, existingCommentLines);
        List<String> newCommentLines = Arrays.asList("line1", "", "line3");
        config.setComment(path, newCommentLines);
        assertThat(config.getAllComments().get(path), is(Collections.unmodifiableList(newCommentLines)));
    }

}