package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_HiddenLines_ReturnsEmptyList {

    private CommentsConfiguration commentsConfiguration;

    @Mock
    private Map<String, List<String>> mockComments;

    @BeforeEach
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration(mockComments);
    }

    @Test
    public void setComment_HiddenLines_ReturnsEmptyList() {
        commentsConfiguration.setComment("path", new String[]{"line1", "line2"});
        Mockito.verify(mockComments).put("path", Collections.emptyList());
    }

}