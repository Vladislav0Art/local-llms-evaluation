package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNewCommentsConfiguration_nonEmptyComments {

    @Test
    public void newCommentsConfiguration_nonEmptyComments() {
        String comment1 = "This is a line with a comment";
        String comment2 = "";
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList(comment1, comment2)));
        assertEquals(1, configuration.getAllComments().size());
        assertTrue(configuration.getAllComments().get("path").contains(comment1));
        assertFalse(configuration.getAllComments().get("path").isEmpty());
    }

}