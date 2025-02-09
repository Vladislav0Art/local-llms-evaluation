package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertThat(commentsConfig.getAllComments(), is(Collections.emptyMap()));
    }

    @Test
    public void commentLineOverriddenWhenSettingMultipleLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Arrays.asList("New line", "with", "comment"));
        commentsConfig.setComment("testPath", "New line");
        commentsConfig.setComment("testPath", "with", "comment");
        assertThat(commentsConfig.getAllComments(), is(expectedComments));
    }

    @Test
    public void singleLineSetsNoComment() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Collections.emptyList());
        commentsConfig.setComment("testPath", "");
        assertThat(commentsConfig.getAllComments(), is(expectedComments));
    }

    @Test
    public void emptyLinesSetsNoComment() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Collections.emptyList());
        commentsConfig.setComment("testPath", "\n");
        assertThat(commentsConfig.getAllComments(), is(expectedComments));
    }

    @Test
    public void setsAllLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Arrays.asList("New line", "with", "comment"));
        commentsConfig.setComment("testPath", "New line");
        commentsConfig.setComment("testPath", "with", "comment");
        assertThat(commentsConfig.getAllComments(), is(expectedComments));
    }

}