package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

public class GeneratedTestGetAllComments {

    private CommentsConfiguration commentsConfiguration;

    @BeforeEach
    void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testGetAllComments() {
        Mockito.when(commentsConfiguration.getAllComments().get("path").get(0)).thenReturn("");
        CommentsConfig commentsConfig = new CommentsConfig();
        commentsConfig.getComments().put("path", new HashMap<>());
        commentsConfig.getComments().get("path").put("comment1", new Comment());
        commentsConfiguration.setComment("path", commentsConfig);
        assertEquals(new java.util.HashMap<>() {{
            put("path", new HashMap<>());
            put("comment1", new Comment());
        }}, commentsConfiguration.getAllComments().get("path"));
    }

}