package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructor_EmptyMap_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.getAllComments());
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

    @Test
    public void constructor_NonEmptyMap_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNotNull(config.getAllComments());
        assertEquals(comments, config.getAllComments());
    }

    @Test
    public void setComment_NonEmptyString_path_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path1", "new-line");
        assertEquals(Collections.singletonMap("path1", Collections.singletonList("new-line")), config.getAllComments());
    }

    @Test
    public void setComment_EmptyString_path_test() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path1", "");
        assertEquals(Collections.singletonMap("path1", Collections.emptyList()), config.getAllComments());
    }

    @Test
    public void setComment_NullString_path_test() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(new HashMap<>()).setComment(null, "new-line"));
    }

    @Test
    public void setComment_NullString_commentLines_test() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertThrows(NullPointerException.class, () -> config.setComment("path1", null));
    }

}