package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentConfigurationTestable;

public class GeneratedCommentLinesSetForPath {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
    private Map<String, List<String>> comments;

    public void whenCommentsConfiguration() {
        comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        comments.put("path2", Collections.singletonList("line3"));
    }

    @Test
    public void commentLinesSetForPath() {
        commentsConfiguration.setComment("path1", "line4", "line5");
        assertEquals(Arrays.asList("line4", "line5"), comments.get("path1"));
    }

}