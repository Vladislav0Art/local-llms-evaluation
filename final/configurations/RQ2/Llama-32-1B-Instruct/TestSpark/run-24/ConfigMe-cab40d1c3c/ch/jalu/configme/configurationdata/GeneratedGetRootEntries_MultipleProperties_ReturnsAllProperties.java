package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_MultipleProperties_ReturnsAllProperties {

    @FunctionalInterface
    interface AddPropertyMethod {
        void add(@NotNull Property<?> property) throws ConfigMeException;
    }

    public static class RootEntriesBuilderTest extends PropertyListBuilderTest {

        private Map<String, Object> rootEntries = new LinkedHashMap<>();

        @Test
        public void getRootEntries_MultipleProperties_ReturnsAllProperties() {
            String key1 = "testKey1";
            String key2 = "testKey2";
            AddPropertyMethod addProperty = () -> null;
            PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
            propertyListBuilder.add(rootEntries.get(key1));
            rootEntries.put(key2, "value");
            propertyListBuilder.add(rootEntries.get(key2));
            assert rootEntries.equals(propertyListBuilder.getRootEntries());
        }
    }

}