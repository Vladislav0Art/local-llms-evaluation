package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_setComment_addsNewLine {

    @Test
    public void newCommentsConfiguration_setComment_addsNewLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {"line1", "\n"};
        Map<String, List<String>> comments = config.comments;
        config.setComment(path, commentLines);
        assertThat(comments.get(path).get(0), is("line1"));
    }

}