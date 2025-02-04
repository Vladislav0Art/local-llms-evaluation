package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAllCommentsReturnsUnmodifiableList {

    @Test
    public void getAllCommentsReturnsUnmodifiableList() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentLines = configuration.getAllComments().get("test");
        try {
            commentLines.remove(0);
            assert false;
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

}