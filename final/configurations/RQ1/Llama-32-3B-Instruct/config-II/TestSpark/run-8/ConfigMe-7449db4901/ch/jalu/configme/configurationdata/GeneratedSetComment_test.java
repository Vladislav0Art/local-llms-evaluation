package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_test {

    @Test
    public void setComment_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1\ncomment2");
        assertNotNull(config.comments.get("path"));
        assertTrue(config.comments.containsKey("path"));
    }

}