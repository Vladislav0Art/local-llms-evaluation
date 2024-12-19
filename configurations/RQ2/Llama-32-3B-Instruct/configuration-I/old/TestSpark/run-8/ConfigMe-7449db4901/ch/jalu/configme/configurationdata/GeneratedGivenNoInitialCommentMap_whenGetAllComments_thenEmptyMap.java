package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenNoInitialCommentMap_whenGetAllComments_thenEmptyMap {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenNoInitialCommentMap_whenGetAllComments_thenEmptyMap() {
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result, emptyCollectionOf(List.class));
    }

}