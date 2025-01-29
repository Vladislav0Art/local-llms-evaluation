package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentConfigurationTestable;

public class GeneratedGetAllComments {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private Map<String, List<String>> comments;

    public void whenCommentsConfiguration() {
        comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        comments.put("path2", Collections.singletonList("line3"));
    }

    @Test
    public void getAllComments() {
        whenCommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path1", Arrays.asList("line1", "line2"));
        expected.put("path2", Collections.singletonList("line3"));
        assertEquals(expected, comments.get("path1"));
        assertEquals(expected, comments.get("path2"));
    }

}