package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Generated[CommentsConfiguration__ConstructorWithCommentsParam]

Test {

    @Mock
    private SettingsHolder settingsHolder;

    @Rule
    public MockitoAnnotations rules = MockitoAnnotations.Builder.build();

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void [CommentsConfiguration__ConstructorWithCommentsParam]Test() {
        Map<String, List<String>> map = Collections.singletonMap("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}