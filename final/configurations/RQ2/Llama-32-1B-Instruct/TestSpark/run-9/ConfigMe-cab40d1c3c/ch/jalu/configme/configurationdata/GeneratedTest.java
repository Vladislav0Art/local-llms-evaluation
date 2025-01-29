package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    public void addProperty(Property<?> property) {
        if (property == null || property.isEmpty()) {
            throw new ConfigMeException("Cannot create property with empty name");
        }
        getRootEntries().putAll(property.getNames());
    }

    @NotNull
    protected List<Property<?>> getProperty() {
        return new ArrayList<>();
    }

    public Map<String, Object> getRootEntries() {
        return new HashMap<>();
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions .*;

public class PropertyListBuilderTest {

    private Property emptyProperty = new Property();

}