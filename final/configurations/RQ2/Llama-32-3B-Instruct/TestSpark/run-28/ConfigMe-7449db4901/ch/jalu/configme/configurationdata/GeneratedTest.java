package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testComments() {
        when(settingsHolder.getComments()).thenReturn(new HashMap<>());
        assertEquals(0, ((List<String>) commentsConfiguration.getAllComments().get("path")).size());
    }

    @Test
    public void testSettingPath1() {
        Map<String, List<String>> path1 = new HashMap<>();
        path1.put("comment11", Arrays.asList("comment12"));
        when(settingsHolder.getComments()).thenReturn(path1);
        assertEquals(Arrays.asList("comment12"), commentsConfiguration.getAllComments().get("path1"));
    }

    @Test
    public void testSettingPath2() {
        Map<String, List<String>> path2 = new HashMap<>();
        path2.put("comment11", Arrays.asList("comment22"));
        when(settingsHolder.getComments()).thenReturn(path2);
        assertEquals(Arrays.asList("comment22"), commentsConfiguration.getAllComments().get("path1"));
    }
}

class SettingsHolder {
    private Map<String, Object> comments = new HashMap<>();

    public void setComments(Map<String, List<String>> comments) {
        this.comments.put("path", comments.get("comments"));
    }

    public Map<String, Object> getComments() {
        return comments;
    }
}

public class CommentsConfiguration {
    private static SettingsHolder settingsHolder = new SettingsHolder();

    public static Map<String, List<String>> getAllComments() {
        return ((List<String>) settingsHolder.getComments().get("path")).isEmpty() ? new HashMap<>() : ((Map<String, Object>) settingsHolder.getComments().get("path")).values().stream()
                .map(Object::toString).collect(Collectors.toList());
    }

}