package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetComment NullCommentLinesTest {

    @Test
    public void setComment

    NullCommentLinesTest() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentLinesMap);
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path1", null));
    }

}