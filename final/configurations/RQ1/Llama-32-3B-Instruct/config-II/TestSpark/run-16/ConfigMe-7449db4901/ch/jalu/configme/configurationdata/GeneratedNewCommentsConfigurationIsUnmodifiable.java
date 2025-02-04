package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNewCommentsConfigurationIsUnmodifiable {

    @Test
    public void newCommentsConfigurationIsUnmodifiable() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        try {
            configuration.comments.put("test", null);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}