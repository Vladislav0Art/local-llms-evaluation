package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.LineComment;
import ch.jalu.configme.configurationdata.SetCommentOptions;
import ch.jalu.configme.settings.SettingsHolder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedComments_configuration_multiple_options_multiple_lines {

    @Test
    public void comments_configuration_multiple_options_multiple_lines() {
        Comment comment = new LineComment();
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList(comment.toString()));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        SetCommentOptions options = new SetCommentOptions("myoptions");
        configuration.setComment("path", Arrays.asList(comment.toString(), "line1", "line2"), options);
        Assertions.assertTrue(configuration.getAllComments().size() == 1 && configuration.getAllComments().get("path").size() == 3);
    }

}