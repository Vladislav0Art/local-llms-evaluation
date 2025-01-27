package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetComment_CommentMarkerTest {

    @Test
    public void setComment_CommentMarkerTest() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("# line1", "# line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentLinesMap);
        List<String> expected = Collections.singletonList("# line1\n# line2");
        List<String> actual = commentsConfiguration.getAllComments().get("path1");
        assertEquals(expected, actual);
    }

}