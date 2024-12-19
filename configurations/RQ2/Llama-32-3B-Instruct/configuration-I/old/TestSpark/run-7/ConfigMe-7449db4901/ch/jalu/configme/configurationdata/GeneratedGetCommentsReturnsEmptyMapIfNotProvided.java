package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.*;

@RunWith(PowerMockRunner.class)
public class GeneratedGetCommentsReturnsEmptyMapIfNotProvided {

    @Test
    public void getCommentsReturnsEmptyMapIfNotProvided() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> allComments = configuration.getAllComments();
        assertTrue(allComments.isEmpty());
    }

}