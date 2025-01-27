package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetComment_ExistingEntryTest {

    @Test
    public void setComment_ExistingEntryTest() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentLinesMap);
        commentsConfiguration.setComment("path1", "# line3");
        List<String> expected = Collections.singletonList("# line1\n# line2\n# line3");
        List<String> actual = commentsConfiguration.getAllComments().get("path1");
        assertEquals(expected, actual);
    }

}