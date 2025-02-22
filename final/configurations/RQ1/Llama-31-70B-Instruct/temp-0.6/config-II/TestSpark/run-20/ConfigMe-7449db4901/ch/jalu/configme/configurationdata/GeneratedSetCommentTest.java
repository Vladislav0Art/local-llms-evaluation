package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();

        config.setComment("path_1", "line_1");

        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("line_1"), config.getAllComments().get("path_1"));
    }

}