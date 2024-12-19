package ch.jalu.configme.configurationdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

GetAllComments {

    @Mock
    private Map<String, List<String>> comments;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void [MethodUnderTest]GetAllComments() {
        // Arrange
        commentsConfiguration.comments.put("path1", Set.of("comment1"));

        // Act
        ObjectMapper mapper = new ObjectMapper();
        Map<String, List<String>> expectedComments = Map.of(
                "path1", Set.of("comment1")
        );

        // Assert
        @Nullable
        Map<String, String> actualComments = comments.getComments();
        assertEquals(expectedComments, actualComments);
    }

}