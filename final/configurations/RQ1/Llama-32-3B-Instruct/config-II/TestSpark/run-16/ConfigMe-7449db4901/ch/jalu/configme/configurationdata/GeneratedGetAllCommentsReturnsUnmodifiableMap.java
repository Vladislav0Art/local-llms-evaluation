package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAllCommentsReturnsUnmodifiableMap {

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = configuration.getAllComments();
        try {
            comments.put("test", null);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}