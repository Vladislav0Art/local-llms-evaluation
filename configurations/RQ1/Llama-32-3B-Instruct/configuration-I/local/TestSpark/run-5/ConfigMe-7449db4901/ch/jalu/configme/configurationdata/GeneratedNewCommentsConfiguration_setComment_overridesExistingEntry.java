package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_setComment_overridesExistingEntry {

    @Test
    public void newCommentsConfiguration_setComment_overridesExistingEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String existingCommentLine = "existing line";
        Map<String, List<String>> comments = config.comments;
        config.setComment(path, existingCommentLine);
        String commentLine1 = "line1";
        String commentLine2 = "line2";
        config.setComment(path, commentLine1, commentLine2);
        assertThat(comments.get(path).contains(existingCommentLine), is(false));
    }

}