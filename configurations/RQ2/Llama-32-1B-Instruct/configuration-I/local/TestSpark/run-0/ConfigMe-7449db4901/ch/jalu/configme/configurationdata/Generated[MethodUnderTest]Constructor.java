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

Constructor {

    @Mock
    private Map<String, List<String>> comments;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void [MethodUnderTest]Constructor() {
        // Arrange
        commentsConfiguration.comments = Map.of("path1", Set.of("comment1"));

        // Act
        commentsConfiguration.comments.put("path2", "another comment");

        // Assert
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> expectedComments = Map.of(
                "path1", "comment1",
                "path2", "another comment"
        );
        Set<String> actualComments = comments.get("path2");
        assertEquals(expectedComments, actualComments);
    }

}