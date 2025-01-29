package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAddPaths {

    @Test
    public void testAddPaths() {
        // Given
        String existingComment = "existing comment";
        ConfigurationPath path1 = new ConfigurationPath(existingComment);
        SetCommentOptions overrides = new SetCommentOptions("myoptions");
        builder.addPath(path1, "newline1", "", true);

        String comment2 = "newer comment";
        ConfigurationPath path2 = new ConfigurationPath(comment2);
        SetCommentOptions overrides2 = new SetCommentOptions("myoptions");
        builder.addPath(path2, "newline3", "", false);

        // When
        builder.addCommentsPath(path1, "newline4", "", true);
        builder.addCommentsPath(path2, "newline5", "", false);

        // Then
        assertEquals(6, path.getComments().size());
    }

}