package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetComment_NullPathTest {

    @Test
    public void setComment_NullPathTest() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(commentLinesMap).setComment(null, "line2"));
    }

}