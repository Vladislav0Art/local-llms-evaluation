package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedTestSettingPath1 {

    @Test
    public void testSettingPath1() {
        Map<String, List<String>> path1 = new HashMap<>();
        path1.put("comment11", Arrays.asList("comment12"));
        when(settingsHolder.getComments()).thenReturn(path1);
        assertEquals(Arrays.asList("comment12"), commentsConfiguration.getAllComments().get("path1"));
    }

}