package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.MapToString;
import ch.jalu.configme.configurationdata.Notifiable;
import ch.jalu.configme.configurationdata.UnmodifiableView;
import mockito.Mocked;
import mockito.Mockito;

public class GeneratedSetComment_MultipleLineComments {

    @Mocked
    private Map<String, List<String>> comments;

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setComment_MultipleLineComments() {
        commentsConfiguration.setComment("path", "line 1\nline 2");
        Mockito.when(comments.get("path")).thenReturn(new String[]{"line 1", "line 2"});
        MapToString assertMapToString = new MapToString();
        Assert.assertTrue(assertMapToString.containsKey("path"));
        Assert.assertEquals(2, assertMapToString.getValueCount("path"));
    }

}