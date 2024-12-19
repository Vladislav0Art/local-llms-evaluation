package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void [Constructor]

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration.comments);
    }

    @Test
    public void [ConstructorWithComments]

    Test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.comments);
    }

    @Test
    public void [SetComment]

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "line1", "line2");
        assertNotNull(configuration.comments.get("path1"));
    }

    @Test
    public void [SetCommentEmptyLine]

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "\n", "");
        assertNotNull(configuration.comments.get("path1"));
        assertEquals(0, ((List<String>) configuration.comments.get("path1")).size());
    }

    @Test
    public void [SetMultipleComments]

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "line11", "line12");
        configuration.setComment("path2", "line21", "line22");
        assertEquals(2, configuration.comments.size());
    }

    @Test
    public void [GetAllComments]

    Test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNotNull(configuration.getAllComments());
        assertEquals(1, configuration.getAllComments().size());
    }

    @Test
    public void [GetAllCommentsEmpty]

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(0, ((Map<String, List<String>>) configuration.getAllComments()).size());
    }

}