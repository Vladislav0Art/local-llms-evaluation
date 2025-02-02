package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorWithCommentsMapTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void constructorWithCommentsMapTest() {
        new CommentsConfiguration(commentsMap);
    }

}