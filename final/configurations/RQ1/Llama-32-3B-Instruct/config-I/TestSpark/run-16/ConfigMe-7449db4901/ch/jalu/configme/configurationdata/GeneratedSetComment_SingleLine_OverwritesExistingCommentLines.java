package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_SingleLine_OverwritesExistingCommentLines {

    @Test
    public void setComment_SingleLine_OverwritesExistingCommentLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "\n");
        config.setComment("", "\n");
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.get("").isEmpty());
    }

}