package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_fromMap_isPopulatedCorrectly() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

    @Test
    public void setComment_emptyString_setsEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "test";
        String commentLines[] = {"", "", ""};
        configuration.setComment(path, commentLines);
        assertTrue(configuration.getAllComments().get(path).isEmpty());
    }

    @Test
    public void setComment_singleLine_setsCorrectly() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "test";
        String commentLines[] = {"#line1"};
        configuration.setComment(path, commentLines);
        assertEquals(Arrays.asList("#line1"), configuration.getAllComments().get(path));
    }

    @Test
    public void setComment_multipleLines_setsCorrectly() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "test";
        String commentLines[] = {"#line1", "#line2"};
        configuration.setComment(path, commentLines);
        assertEquals(Arrays.asList("#line1", "#line2"), configuration.getAllComments().get(path));
    }

    @Test
    public void setComment_duplicateLines_fails() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "test";
        String commentLines[] = {"#line1", "#line1"};
        assertThrows(NullPointerException.class, () -> configuration.setComment(path, commentLines));
    }

}