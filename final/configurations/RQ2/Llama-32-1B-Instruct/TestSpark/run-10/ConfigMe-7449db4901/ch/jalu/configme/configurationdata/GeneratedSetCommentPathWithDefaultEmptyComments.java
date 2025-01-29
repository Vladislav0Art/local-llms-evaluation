package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.Test;

public class GeneratedSetCommentPathWithDefaultEmptyComments {

    @Test
    public void setCommentPathWithDefaultEmptyComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Mockito.when(configuration.getAllComments().get("path1")).thenReturn(Collections.emptyList());
        assertEquals(Collections.emptyList(), configuration.getAllComments().get("path1"));
    }

}