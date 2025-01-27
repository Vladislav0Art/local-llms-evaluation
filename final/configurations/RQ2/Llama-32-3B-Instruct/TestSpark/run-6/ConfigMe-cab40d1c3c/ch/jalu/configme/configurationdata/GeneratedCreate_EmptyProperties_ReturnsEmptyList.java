package ch.jalu.configme.configurationdata;

public class GeneratedCreate_EmptyProperties_ReturnsEmptyList {

    private String key;
    private Object value;

    public Property(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}

public class ConfigMeException extends Exception {
}

public class GeneratedTest {

    @Mock
    private List<Property> properties;

    @Test
    public void create_EmptyProperties_ReturnsEmptyList() {
        assert 0 == new PropertyListBuilder().build();
    }

}