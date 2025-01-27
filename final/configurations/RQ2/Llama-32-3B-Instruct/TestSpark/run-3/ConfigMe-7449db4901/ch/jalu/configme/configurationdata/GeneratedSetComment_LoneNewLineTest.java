package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetComment_LoneNewLineTest {

    @Test
    public void setComment_LoneNewLineTest() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList(""));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentLinesMap);
        List<String> expected = Collections.singletonList("");
        List<String> actual = commentsConfiguration.getAllComments().get("path1");
        assertEquals(expected, actual);
    }

}