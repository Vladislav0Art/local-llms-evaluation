package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSetComment_duplicatePath {

    @Test
    public void setComment_duplicatePath() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String comment1 = "This is a line with a comment";
        String comment2 = "";
        configuration.setComment("path1", comment1, comment2);
        assertEquals(0, configuration.getAllComments().get("path2").size());
    }

}