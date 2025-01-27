package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetComment_emptyLine {

    @Test
    public void setComment_emptyLine() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {""};
        config.setComment("path", commentLines[0]);
        assertEquals(1, config.getAllComments().size());
    }

}