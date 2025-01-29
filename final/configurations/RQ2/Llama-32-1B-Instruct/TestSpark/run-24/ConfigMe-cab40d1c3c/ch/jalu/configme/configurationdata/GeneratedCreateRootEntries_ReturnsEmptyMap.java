package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateRootEntries_ReturnsEmptyMap {

    @FunctionalInterface
    interface AddPropertyMethod {
        void add(@NotNull Property<?> property) throws ConfigMeException;
    }

    public static class RootEntriesBuilderTest extends PropertyListBuilderTest {

        private Map<String, Object> rootEntries = new LinkedHashMap<>();

        @Test
        public void createRootEntries_ReturnsEmptyMap() {
            AddPropertyMethod addProperty = () -> null;
            propertyListBuilder = new PropertyListBuilder();
            Assert.assertFalse(propertyListBuilder.create().isEmpty());
            Assert.assertTrue(rootEntries.equals(propertyListBuilder.getRootEntries()));
        }
    }

}