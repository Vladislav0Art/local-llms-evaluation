package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConstructorCreatesEmptyMap {

    @Test
    public void constructorCreatesEmptyMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(0, commentsConfiguration.comments.size());
    }

}