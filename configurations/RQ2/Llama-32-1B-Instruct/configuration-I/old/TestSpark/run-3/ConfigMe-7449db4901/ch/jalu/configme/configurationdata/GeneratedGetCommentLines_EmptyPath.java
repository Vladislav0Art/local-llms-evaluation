package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.MapToString;
import ch.jalu.configme.configurationdata.Notifiable;
import ch.jalu.configme.configurationdata.UnmodifiableView;
import mockito.Mocked;
import mockito.Mockito;

public class GeneratedGetCommentLines_EmptyPath {

    @Mocked
    private Map<String, List<String>> comments;

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void getCommentLines_EmptyPath() {
        commentsConfiguration.setComment("", "line 1\nline 2");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1"});
        Notifiable notifiable = mock(Notifiable.class);
        MapToString mapToString = new MapToString();
        Assert.assertFalse(mapToString.containsKey("path"));
    }

}