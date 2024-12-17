package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.*;

@RunWith(PowerMockRunner.class)
public class GeneratedGetAllCommentsReturnsUnmodifiableMap {

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration configuration = new CommentsConfiguration(new HashMap<>());
        Map<String, @UnmodifiableView List<String>> allComments = configuration.getAllComments();
        assertNotSame(allComments, configuration.getAllComments());
    }

}