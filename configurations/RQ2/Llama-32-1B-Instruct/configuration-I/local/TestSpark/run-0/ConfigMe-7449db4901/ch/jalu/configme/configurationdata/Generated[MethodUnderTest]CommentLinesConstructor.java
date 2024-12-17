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

CommentLinesConstructor {

    @Mock
    private Map<String, List<String>> comments;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void [MethodUnderTest]CommentLinesConstructor() {
        // Arrange
        String path = "path1";
        String...commentLines = {"comment1", "", "another comment"};

        // Act
        commentsConfiguration.setComment(path, commentLines);

        // Assert
        ObjectMapper mapper = new ObjectMapper();
        Map<String, List<String>> expectedComments = Map.of(
                "path1", Set.of("comment1", "another comment")
        );
        assertEquals(expectedComments, comments.get(path));
    }

}