package ch.jalu.configme.configurationdata;

public class GeneratedTest3 {

    @Test
    public void test3() throws ConfigMeException {
        Map<String, Object> map = new LinkedHashMap<>();
        Property p5 = new Property("e", 5);
        builder.add(p5);
        map.put("e", 5);
    }
}

public class TestConfigMeException extends Exception {
}

class ConfigMeException extends RuntimeException implements Exception {
    public ConfigMeException(String message) {
        super(message);
    }
}

class Property {
    private String key;
    private Object value;

    public Property(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}

class Builder {
    private Map<String, Object> map;

    public Builder add(Property p) {
        map.put(p.getKey(), p.getValue());
        return this;
    }

    public List<Property> create() {
        return new ArrayList<>(map.values());
    }

}