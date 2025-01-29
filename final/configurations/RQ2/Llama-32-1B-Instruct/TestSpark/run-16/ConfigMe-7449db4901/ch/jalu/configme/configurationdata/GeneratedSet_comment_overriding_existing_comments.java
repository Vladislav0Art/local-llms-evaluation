package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.LineComment;
import ch.jalu.configme.configurationdata.SetCommentOptions;
import ch.jalu.configme.settings.SettingsHolder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSet_comment_overriding_existing_comments {

    @Test
    public void set_comment_overriding_existing_comments() {
        Comment comment = new LineComment();
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList(comment.toString()));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        // override existing lines
        SetCommentOptions options = new SetCommentOptions("myoptions");
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.addCommentsPath(new ConfigurationPath(configuration), "existing comment", comment.toString());
        configuration.setComment("path", Arrays.asList(comment.toString()), options, builder);

        // add two new lines that override the existing one
        SetCommentOptions overrides = new SetCommentOptions("myoptions");
        builder.addCommentsPath(new ConfigurationPath(configuration), "newline1", "", true);
        builder.addCommentsPath(new ConfigurationPath(configuration), "newline2", "", false);
        configuration.setComment("path", Arrays.asList(comment.toString(), "newline1", "newline2"), overrides);

        Assertions.assertTrue(configuration.getAllComments().size() == 3 && configuration.getAllComments().get("path").size() == 4);
    }

}