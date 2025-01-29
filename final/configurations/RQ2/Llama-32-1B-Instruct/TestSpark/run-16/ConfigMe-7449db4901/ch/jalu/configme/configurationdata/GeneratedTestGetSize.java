package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetSize {

    @Test
    public void testGetSize() {
        // Given
        String existingComment = "existing comment";
        ConfigurationPath path = new ConfigurationPath(existingComment);
        SetCommentOptions overrides = new SetCommentOptions("myoptions");

        // When
        builder.addPaths(path, override.getComment(), "", false);

        // Then
        assertEquals(1, path.getComments().size());
    }

}