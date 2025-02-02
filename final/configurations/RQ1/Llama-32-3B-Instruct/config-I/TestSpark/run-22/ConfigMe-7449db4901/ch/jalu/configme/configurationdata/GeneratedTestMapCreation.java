package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestMapCreation {

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>();
    }
}

class GeneratedTest {

    @Test
    public void testMapCreation() {
        // setup mock objects and calls on them
        Map<String, List<String>> commentsMap = new HashMap<>();

        // check if the map was created with the correct values
        assertThat(commentsMap, equalTo(Map.of()));
    }

}