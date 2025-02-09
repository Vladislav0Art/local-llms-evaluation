package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedConstructorEmptyTest {

    @Test
    public void constructorEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(0, allComments.size());
    }

}