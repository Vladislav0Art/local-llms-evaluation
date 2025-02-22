package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();

        config.setComment("path_1", "line_1");

        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("line_1"), config.getAllComments().get("path_1"));
    }

    @Test
    public void setCommentWithEmptyLinesTest() {
        CommentsConfiguration config = new CommentsConfiguration();

        config.setComment("path_2", "line_1", "\n", "line_3");

        assertEquals(1, config.getAllComments().size());
        assertEquals(Arrays.asList("line_1", "line_3"), config.getAllComments().get("path_2"));
    }

    @Test
    public void setCommentWithNullTest() {
        CommentsConfiguration config = new CommentsConfiguration();

        config.setComment("path_3", null);

        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList(null), config.getAllComments().get("path_3"));
    }

}