package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.MapToString;
import ch.jalu.configme.configurationdata.Notifiable;
import ch.jalu.configme.configurationdata.UnmodifiableView;
import mockito.Mocked;
import mockito.Mockito;

public class GeneratedSetComment_EmptyLine {

    @Mocked
    private Map<String, List<String>> comments;

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setComment_EmptyLine() {
        commentsConfiguration.setComment("path", "");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1"});
        MapToString assertMapToString = new MapToString();
        Assert.assertTrue(assertMapToString.containsKey("path"));
        Assert.assertEquals(1, assertMapToString.getValueCount("path"));
    }

}