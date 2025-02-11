package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private String message;

    public ConfigMeException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "ConfigMeException{" +
                "message='" + message + '\'' +
                '}';
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

}