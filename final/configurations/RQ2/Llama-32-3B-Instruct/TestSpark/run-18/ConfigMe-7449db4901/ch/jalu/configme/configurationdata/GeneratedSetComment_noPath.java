package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetComment_noPath {

    @Test
    public void setComment_noPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {"comment"};
        assertThrows(NullPointerException.class, () -> config.setComment(null, commentLines));
    }

}