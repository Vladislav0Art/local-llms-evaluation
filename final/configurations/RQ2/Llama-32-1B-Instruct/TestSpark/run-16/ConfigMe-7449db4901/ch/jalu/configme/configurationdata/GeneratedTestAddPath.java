package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAddPath {

    @Test
    public void testAddPath() {
        // Given
        String existingComment = "existing comment";
        ConfigurationPath path = new ConfigurationPath(existingComment);

        // When
        SetCommentOptions overrides = new SetCommentOptions("myoptions");
        builder.addPath(path, "newline1", "", true);
        builder.addPath(path, existingComment, override.getComment(), false);

        // Then
        assertEquals(4, path.getComments().size());
    }

}