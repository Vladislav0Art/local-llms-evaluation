package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenTwoNewEntriesForSingleLinePath_whenSetComment_thenMultipleEntryAdded {

    @Mock
    private Map<String, List<String>> commentsMap;

    @InjectMocks
    private CommentsConfiguration configuration;

    @RunWith(MockitoJUnitRunner.class)
    public static void main(String[] args) {
        // Initialize the test runner
    }

    @Test
    public void givenTwoNewEntriesForSingleLinePath_whenSetComment_thenMultipleEntryAdded() {
        String path = "";
        Set<String> commentLines1 = new HashSet<>();
        commentLines1.add("comment1");
        Set<String> commentLines2 = new HashSet<>();
        commentLines2.add("comment2");
        Mockito.when(configuration.setComment(path, commentLines1)).thenReturn(null);
        Mockito.when(configuration.setComment(path, commentLines2)).thenReturn(null);
        Map<String, List<String>> result = configuration.getAllComments();
        assertThat(result.size(), is(2));
    }

}