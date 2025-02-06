package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_emptyMap() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_nonEmptyMap() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(1, configuration.getAllComments().size());
    }

    @Test
    public void setComment_setsCommentsForPath() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "line1", "line2");
        assertEquals(2, ((List<String>) configuration.getAllComments().get("path")).size());
    }

    @Test
    public void setComment_setsEmptyLineForNewPath() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("", "line1", "line2");
        assertEquals(1, ((List<String>) configuration.getAllComments().get("")).size());
    }

    @Test
    public void setComment_overridesExistingComments() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        ((List<String>) ((List<String>) ((Map) Mockito.mock(Map.class)).get("path"))).clear();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "line1", "line2");
        assertEquals(2, ((List<String>) configuration.getAllComments().get("path")).size());
    }

    @Test
    public void setComment_setsCommentsForMultiplePaths() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "line1", "line2");
        assertEquals(2, ((List<String>) configuration.getAllComments().get("path1")).size());
    }

    @Test
    public void setComment_setsEmptyLineForMultiplePaths() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("", "line1", "line2");
        assertEquals(1, ((List<String>) configuration.getAllComments().get("")).size());
    }

    @Test
    public void setComment_setsCommentsForAllPaths() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path1", "line1", "line2");
        assertEquals(3, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
    }

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        List<String> list = ((List<String>) ((Map) Mockito.mock(Map.class)).get("path"));
        assertTrue(list instanceof @UnmodifiableView);
    }

    @Test
    public void getAllComments_returnsAllPaths() {
        Map<String, List<String>> comments = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(1, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
    }

    @Test
    public void setComment_setsSingleEntryForAllPaths() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        configuration.setComment("path", "");
        assertEquals(1, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
    }

}