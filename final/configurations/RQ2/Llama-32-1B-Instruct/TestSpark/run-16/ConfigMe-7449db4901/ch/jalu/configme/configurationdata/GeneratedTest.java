package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

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

    @Test
    public void testGetComment() {
        // Given
        String existingComment = "existing comment";
        ConfigurationPath path = new ConfigurationPath(existingComment);
        SetCommentOptions overrides = new SetCommentOptions("myoptions");

        // When
        builder.addPaths(path, override.getComment(), "", false);

        // Then
        assertEquals(1, path.getComments().size());
    }

    @Test
    public void testGetPaths() {
        // Given
        String existingComment = "existing comment";
        ConfigurationPath path = new ConfigurationPath(existingComment);
        SetCommentOptions overrides = new SetCommentOptions("myoptions");

        // When
        builder.addPaths(path, override.getComment(), "", false);

        // Then
        assertEquals(1, path.getComments().size());
    }

    @Test
    public void testGetAll() {
        // Given
        String existingComment = "existing comment";
        ConfigurationPath path = new ConfigurationPath(existingComment);
        SetCommentOptions overrides = new SetCommentOptions("myoptions");

        // When
        builder.addPaths(path, override.getComment(), "", false);

        // Then
        assertEquals(1, path.getComments().size());
    }

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