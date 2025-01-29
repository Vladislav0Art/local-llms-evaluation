package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestCreate_MultipleEntries Mocked {

    public void add(Property<?> property) {
        testAdd(property, "Property added successfully");
    }

    public @NotNull List<Property<?>> create() {
        testCreate();
        return this.propertyLists.get(0);
    }

    protected final @NotNull Map<String, Object> getRootEntries() {
        // TO DO: implement root entries retrieval
        return null;
    }
}

public class PropertyListBuilderTest {

    private PropertyListBuilder propertyListBuilder;

    public void setup() {
        this.propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testCreate_MultipleEntries

    Mocked() throws ConfigMeException {
        // Arrange
        List<Property<?>> multipleEntry1 = new MultipleEntry("multiple", "simple");
        List<Property<?>> multipleEntry2 = new MultipleEntry("multiple2", "simple");

        // Act
        this.propertyListBuilder.create();

        // Assert
        assert !propertyLists.isEmpty();
    }

}