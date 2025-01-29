package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_should_not_add_property_twice {

    public static class AddPropertyTest extends PropertyListBuilder {
        private @NotNull Property<?> property;

        public AddPropertyTest(Property<?> property) {
            this.property = property;
        }

        @Override
        public void add(@NotNull Property<?> property) {
            this.property = property;
        }
    }

    public static class CreatePropertyListTest extends PropertyListBuilder {
        private List<Property<?>> propertyList;

        public CreatePropertyListTest() {
            this.propertyList = new ArrayList<>();
        }

        @Override
        public @NotNull List<Property<?>> create() {
            return propertyList;
        }
    }

    public static class GetRootEntriesTest extends PropertyListBuilder {
        private Map<String, Object> rootEntries;

        public GetRootEntriesTest(Map<String, Object> rootEntries) {
            this.rootEntries = rootEntries;
        }

        @Override
        public @NotNull Map<String, Object> getRootEntries() {
            return rootEntries;
        }
    }

    public static class CreatePropertyListWithMockedAddMethodTest extends PropertyListBuilder {
        private MockProperty mockProperty;

        public CreatePropertyListWithMockedAddMethodTest(MockProperty mockProperty) {
            this.mockProperty = mockProperty;
        }

        @Override
        public void add(@NotNull Property<?> property) {
            mockProperty.add(property);
        }
    }

    public static class CreatePropertyListAndGetRootEntriesTest extends PropertyListBuilder {
        private Map<String, Object> rootEntries;

        public CreatePropertyListAndGetRootEntriesTest(Map<String, Object> rootEntries) {
            this.rootEntries = rootEntries;
        }

        @Override
        public @NotNull Map<String, Object> getRootEntries() {
            return rootEntries;
        }
    }

    public static class MockProperty {
        private List<Property<?>> list;

        public void add(@NotNull Property<?> property) {
            list.add(property);
        }
    }

    @Test
    public void AddProperty_should_not_add_property_twice() {
        AddPropertyTest test = new AddPropertyTest(null);
        test.add(new Property("test", "value"));
        Assert.assertFalse(test.property.equals(new Property("test", "value")));
    }

}