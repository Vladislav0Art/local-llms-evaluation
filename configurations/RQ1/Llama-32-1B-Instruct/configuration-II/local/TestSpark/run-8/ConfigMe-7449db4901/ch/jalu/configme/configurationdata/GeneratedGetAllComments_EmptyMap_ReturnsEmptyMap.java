package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

public class GeneratedGetAllComments_EmptyMap_ReturnsEmptyMap {

    private CommentsConfiguration commentsConfiguration;

    @Mock
    private Map<String, List<String>> mockComments;

    @BeforeEach
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration(mockComments);
    }

    @Test
    public void getAllComments_EmptyMap_ReturnsEmptyMap() {
        commentsConfiguration.setComment("path", new String[0]);
        Mockito.verifyAll();
    }

}