package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.MapToString;
import ch.jalu.configme.configurationdata.Notifiable;
import ch.jalu.configme.configurationdata.UnmodifiableView;
import mockito.Mocked;
import mockito.Mockito;

public class GeneratedGetCommentLines {

    @Mocked
    private Map<String, List<String>> comments;

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void getCommentLines() {
        commentsConfiguration.setComment("path", "line 1\nline 2");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1", "line 2"});
        Notifiable notifiable = mock(Notifiable.class);
        List<String> commentLines = new ArrayList<>();
        notifiable.add(commentLines);
        commentsConfiguration.setComment(notifiable);
        MapToString mapToString = new MapToString();
        Assert.assertTrue(mapToString.containsKey("path"));
        Assert.assertEquals(2, mapToString.getValueCount("path"));
    }

}