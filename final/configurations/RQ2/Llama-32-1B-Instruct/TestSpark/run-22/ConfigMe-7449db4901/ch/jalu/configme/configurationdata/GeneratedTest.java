package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void commentsConfigurationConstructors() {
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.comments == null);
        Assertions.assertTrue(config.comments instanceof Map);

        CommentsConfiguration comments = Mockito.mock(CommentsConfiguration.class);
        Mockito.when(comments.getComments()).thenReturn(Collections.singletonMap("path", Arrays.asList("line1", "line2")));
    }

    @Test
    public void commentsConfigurationSetComment() {
        SettingsHolder settings = new SettingsHolder();
        settings.setComments(new CommentsConfiguration().comments);
        Assert.assertTrue(settings.getSettingsHolder().getComments().containsKey("path"));
        Assert.assertEquals(0, settings.getSettingsHolder().getComments().get("path").size());
    }

    @Test
    public void commentsConfigurationGetAllComments() {
        SettingsHolder settings = new SettingsHolder();
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("line1", "line2"));
        Mockito.when(settings.getSettingsHolder().getComments()).thenReturn(commentsMap);
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.getAllComments() instanceof Map);

        Map<String, List<String>> expectedMap = Collections.singletonMap("path", Arrays.asList("line1", "line2"));
        Assertions.assertTrue(expectedMap.equals(config.getAllComments()));
    }

    @Test
    public void commentsConfigurationCommentLinesSetting() {
        SettingsHolder settings = new SettingsHolder();
        String path = "path";
        Comment comment = new Comment("", "");
        Mockito.when(settings.getSettingsHolder().getComments()).thenReturn(Collections.singletonMap(path, Arrays.asList(comment)));
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.setComment(path, comment));
    }

    @Test
    public void commentsConfigurationCommentLinesReading() {
        SettingsHolder settings = new SettingsHolder();
        String path = "path";
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(settings.getSettingsHolder().getComments()).thenReturn(Collections.singletonMap(path, Collections.singletonList(comment)));
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.getAllComments().containsKey("path"));
        Assertions.assertEquals(1, config.getAllComments().get("path").size());
    }

    @Test
    public void commentsConfigurationCommentLinesReadingWithNull() {
        SettingsHolder settings = new SettingsHolder();
        String path = "path";
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(settings.getSettingsHolder().getComments()).thenReturn(Collections.singletonMap(path, Collections.singletonList(comment)));
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertTrue(config.getAllComments().containsKey("path"));
        Assertions.assertEquals(1, config.getAllComments().get("path").size());
    }

}