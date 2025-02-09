package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        var config = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

    @Test
    public void commentsConfigurationHasCorrectComments() {
        var config = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList("line1", "line2")));
        assertEquals(Collections.singletonMap("path", Collections.unmodifiableList(Arrays.asList("line1", "line2"))), config.getAllComments());
    }

    @Test
    public void setCommentSetsCorrectPath() {
        var config = new CommentsConfiguration();
        config.setComment("path", "line1");
        assertEquals(Collections.singletonMap("path", Arrays.asList("line1")), config.getAllComments());
    }

    @Test
    public void setCommentDoesntOverrideExistingLines() {
        var config = new CommentsConfiguration(Collections.singletonMap("existingPath", Arrays.asList("existingLine")));
        config.setComment("existingPath", "newLine");
        assertEquals(Collections.singletonMap("existingPath", Arrays.asList("existingLine")), config.getAllComments());
    }

    @Test
    public void setCommentAddsNewLine() {
        var config = new CommentsConfiguration(Collections.emptyMap());
        config.setComment("path", "", "\n", "");
        assertEquals(Arrays.asList("", ""), config.getAllComments().get("path"));
    }

    @Test
    public void setCommentThrowsForNullPathOrLinesArray() {
        var config = new CommentsConfiguration();
        config.setComment(null, null);
    }

}