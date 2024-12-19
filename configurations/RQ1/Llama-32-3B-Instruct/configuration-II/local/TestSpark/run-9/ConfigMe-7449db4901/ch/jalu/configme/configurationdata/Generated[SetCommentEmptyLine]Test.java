package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generated[SetCommentEmptyLine]

Test {

    @Test
    public void [SetCommentEmptyLine]Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "\n", "");
        assertNotNull(configuration.comments.get("path1"));
        assertEquals(0, ((List<String>) configuration.comments.get("path1")).size());
    }

}