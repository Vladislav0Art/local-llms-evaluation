package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.MapToString;
import ch.jalu.configme.configurationdata.Notifiable;
import ch.jalu.configme.configurationdata.UnmodifiableView;
import mockito.Mocked;
import mockito.Mockito;

public class GeneratedTest {

    @Mocked
    private Map<String, List<String>> comments;

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setComment_SingleLineComment() {
        commentsConfiguration.setComment("path", "line 1");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1"});
        MapToString assertMapToString = new MapToString();
        Assert.assertTrue(assertMapToString.containsKey("path"));
        Assert.assertEquals(1, assertMapToString.getValueCount("path"));
    }

    @Test
    public void setComment_MultipleLineComments() {
        commentsConfiguration.setComment("path", "line 1\nline 2");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1", "line 2"});
        MapToString assertMapToString = new MapToString();
        Assert.assertTrue(assertMapToString.containsKey("path"));
        Assert.assertEquals(2, assertMapToString.getValueCount("path"));
    }

    @Test
    public void setComment_EmptyLine() {
        commentsConfiguration.setComment("path", "");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1"});
        MapToString assertMapToString = new MapToString();
        Assert.assertTrue(assertMapToString.containsKey("path"));
        Assert.assertEquals(1, assertMapToString.getValueCount("path"));
    }

    @Test
    public void getAllComments() {
        commentsConfiguration.setComment("path", "line 1\nline 2");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1", "line 2"});
        UnmodifiableView mapToString = new MapToString();
        Notifiable notifiable = mock(Notifiable.class);
        Map<String, List<String>> result = commentsConfiguration.getAllComments(notifiable);
        Mockito.verify(result).get("path").equals(mapToString.getValue());
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

    @Test
    public void getCommentLines_EmptyPath() {
        commentsConfiguration.setComment("", "line 1\nline 2");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1"});
        Notifiable notifiable = mock(Notifiable.class);
        MapToString mapToString = new MapToString();
        Assert.assertFalse(mapToString.containsKey("path"));
    }

}