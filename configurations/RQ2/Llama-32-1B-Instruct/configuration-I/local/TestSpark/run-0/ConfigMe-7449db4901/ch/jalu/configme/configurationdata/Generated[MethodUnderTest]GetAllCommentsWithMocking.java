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

GetAllCommentsWithMocking {

    @Mock
    private Map<String, List<String>> comments;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void [MethodUnderTest]GetAllCommentsWithMocking() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();

        // Act
        Map<String, List<String>> expectedComments = Map.of(
                "path1", Set.of("comment1")
        );
        @Nullable
        Map<String, String> actualComments = comments.getComments();
        assertEquals(expectedComments, actualComments);
    }

}