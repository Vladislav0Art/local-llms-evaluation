package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class GeneratedSetComment_singleLineComment_test {

    @Test
    public void setComment_singleLineComment_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertTrue(config.comments.containsKey("path"));
        assertEquals(0, ((List<String>) config.comments.get("path")).size());
    }

}