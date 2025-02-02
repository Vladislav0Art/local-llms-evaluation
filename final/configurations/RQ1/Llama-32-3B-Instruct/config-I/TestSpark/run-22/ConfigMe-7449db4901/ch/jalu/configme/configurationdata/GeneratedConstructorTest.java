package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorTest {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void constructorTest() {
        new CommentsConfiguration();
    }

}