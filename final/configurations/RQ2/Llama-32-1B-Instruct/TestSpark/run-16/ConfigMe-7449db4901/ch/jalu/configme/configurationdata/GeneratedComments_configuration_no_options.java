package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.LineComment;
import ch.jalu.configme.configurationdata.SetCommentOptions;
import ch.jalu.configme.settings.SettingsHolder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedComments_configuration_no_options {

    @Test
    public void comments_configuration_no_options() {
        Comment comment = new LineComment();
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList(comment.toString()));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", comment.toString());
        Assertions.assertTrue(configuration.getAllComments().size() == 1 && configuration.getAllComments().get("path").size() == 1);
    }

}