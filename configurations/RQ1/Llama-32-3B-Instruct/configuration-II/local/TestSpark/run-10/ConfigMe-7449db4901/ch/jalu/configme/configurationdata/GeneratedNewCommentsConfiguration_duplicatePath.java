package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNewCommentsConfiguration_duplicatePath {

    @Test
    public void newCommentsConfiguration_duplicatePath() {
        CommentsConfiguration configuration = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList("This is a line with a comment")));
        assertEquals(0, configuration.getAllComments().size());
    }

}