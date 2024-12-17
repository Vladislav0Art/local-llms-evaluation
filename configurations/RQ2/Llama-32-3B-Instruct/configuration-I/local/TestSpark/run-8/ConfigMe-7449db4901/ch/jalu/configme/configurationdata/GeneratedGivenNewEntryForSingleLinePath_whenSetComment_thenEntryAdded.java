package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenNewEntryForSingleLinePath_whenSetComment_thenEntryAdded {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenNewEntryForSingleLinePath_whenSetComment_thenEntryAdded() {
        String path = "";
        Set<String> commentLines = new HashSet<>();
        commentLines.add("comment");
        Mockito.when(configuration.setComment(path, commentLines)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(1));
    }

}