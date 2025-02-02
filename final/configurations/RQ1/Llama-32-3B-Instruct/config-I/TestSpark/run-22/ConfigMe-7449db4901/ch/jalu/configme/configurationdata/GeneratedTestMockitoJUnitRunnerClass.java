package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestMockitoJUnitRunnerClass {

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>();
    }
}

class GeneratedTest {

    @Test
    public void testMockitoJUnitRunnerClass() {
        // setup mock objects and calls on them
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        CommentsConfiguration allComments = new CommentsConfiguration();

        // check if the class was created with the correct values
        assertThat(allComments, equalTo(commentsConfiguration));
    }

}