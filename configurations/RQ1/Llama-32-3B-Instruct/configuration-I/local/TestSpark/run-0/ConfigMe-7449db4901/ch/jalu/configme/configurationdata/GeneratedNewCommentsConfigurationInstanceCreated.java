package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import javax.annotation.Resource;

public class GeneratedNewCommentsConfigurationInstanceCreated {

    @Resource
    public static final CommentsConfiguration instance = new CommentsConfiguration();

    @Test
    public void newCommentsConfigurationInstanceCreated() {
        assertNotNull(instance);
        assertTrue((instance.comments instanceof HashMap));
        Mockito.when(instance.comments.containsKey(null)).thenReturn(true);
        Mockito.when(instance.comments.get(null)).thenReturn(new ArrayList<>());
    }

}