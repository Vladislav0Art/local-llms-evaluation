package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestBuilder {

    private String message;

    public ConfigMeException(String message) {
        super(message);
        this.message = message;
    }
}

public class Builder {
    private Map<String, Object> map = new LinkedHashMap<>();

    public void add(Property p) {
        map.put(p.getKey(), p.getValue());
    }

    public List<Object> create() {
        return new ArrayList<>(map.values());
    }
}

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testBuilder() {
        Builder builder = new Builder();
        Property p1 = new Property("key1", "value1");
        Property p2 = new Property("key2", 123);
        Property p3 = new Property("key3", true);

        builder.add(p1);
        builder.add(p2);
        builder.add(p3);

        List<Object> values = builder.create();
        assert values.contains("value1");
        assert values.contains(123);
        assert values.contains(true);
    }

}