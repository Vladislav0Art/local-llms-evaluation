package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentWithNullTest {

    @Test
    public void setCommentWithNullTest() {
        CommentsConfiguration config = new CommentsConfiguration();

        config.setComment("path_3", null);

        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList(null), config.getAllComments().get("path_3"));
    }

}