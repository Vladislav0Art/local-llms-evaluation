package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedTestComments {

    @Test
    public void testComments() {
        when(settingsHolder.getComments()).thenReturn(new HashMap<>());
        assertEquals(0, ((List<String>) commentsConfiguration.getAllComments().get("path")).size());
    }

}