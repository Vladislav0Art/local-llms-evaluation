package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void constructorEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path.one", Collections.singletonList("comment one"));
        comments.put("path.two", Collections.singletonList("comment two"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(2, commentsConfiguration.getAllComments().size());
        assertEquals(Collections.singletonList("comment one"), commentsConfiguration.getAllComments().get("path.one"));
        assertEquals(Collections.singletonList("comment two"), commentsConfiguration.getAllComments().get("path.two"));
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2", "line3");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        List<String> commentLines = commentsConfiguration.getAllComments().get("path");
        assertEquals(3, commentLines.size());
        assertEquals("line1", commentLines.get(0));
        assertEquals("line2", commentLines.get(1));
        assertEquals("line3", commentLines.get(2));
    }

    @Test
    public void overrideCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");
        commentsConfiguration.setComment("path", "line3", "line4");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        List<String> commentLines = commentsConfiguration.getAllComments().get("path");
        assertEquals(2, commentLines.size());
        assertEquals("line3", commentLines.get(0));
        assertEquals("line4", commentLines.get(1));
    }

}