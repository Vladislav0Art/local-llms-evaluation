package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_should_return_the_root_entries_map {

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
    public void GetRootEntries_should_return_the_root_entries_map() {
        GetRootEntriesTest test = new GetRootEntriesTest(new LinkedHashMap<>());
        Map<String, Object> rootEntries = test.getRootEntries();
        Assert.assertEquals(rootEntries, test.getRootEntries());
    }

}