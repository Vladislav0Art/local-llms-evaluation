package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetComment NullPathTest {

    @Test
    public void setComment

    NullPathTest() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentLinesMap);
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment(null, "line2"));
    }

}