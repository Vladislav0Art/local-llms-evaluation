package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddNullPropertyTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addNullPropertyTest() {
        assertThrows(ConfigMeException.class, () -> builder.add(null));
    }
}

public class MockedPropertyListBuilder extends PropertyListBuilder {

    private List<Property<?>> properties = new ArrayList<>();

    @Override
    protected final @NotNull Map<String, Object> getRootEntries() {
        return super.getRootEntries();
    }

    public void add(Property<?> property) {
        properties.add(property);
    }

    public List<Property<?>> create() {
        return properties;
    }
}

}