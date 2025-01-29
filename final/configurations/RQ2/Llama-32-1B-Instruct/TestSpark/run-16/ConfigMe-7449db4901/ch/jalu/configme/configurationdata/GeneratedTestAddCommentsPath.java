package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAddCommentsPath {

    @Test
    public void testAddCommentsPath() {
        // Given
        String existingComment = "existing comment";
        ConfigurationPath path = new ConfigurationPath(existingComment);

        // When
        SetCommentOptions overrides = new SetCommentOptions("myoptions");
        builder.addCommentsPath(path, "newline1", "", true);
        builder.addCommentsPath(path, existingComment, override.getComment(), false);

        // Then
        assertEquals(4, path.getComments().size());
    }

}