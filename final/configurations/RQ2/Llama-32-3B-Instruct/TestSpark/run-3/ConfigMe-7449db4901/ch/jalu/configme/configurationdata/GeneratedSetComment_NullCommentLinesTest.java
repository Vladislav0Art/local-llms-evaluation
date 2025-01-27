package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetComment_NullCommentLinesTest {

    @Test
    public void setComment_NullCommentLinesTest() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(commentLinesMap).setComment("path1", null));
    }

}