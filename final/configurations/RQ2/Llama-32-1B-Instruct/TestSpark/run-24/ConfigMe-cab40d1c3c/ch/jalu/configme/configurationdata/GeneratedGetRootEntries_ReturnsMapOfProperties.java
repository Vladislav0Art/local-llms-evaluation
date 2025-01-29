package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetRootEntries_ReturnsMapOfProperties {

    @FunctionalInterface
    interface AddPropertyMethod {
        void add(@NotNull Property<?> property) throws ConfigMeException;
    }

    public static class RootEntriesBuilderTest extends PropertyListBuilderTest {

        private Map<String, Object> rootEntries = new HashMap<>();

        @Test
        public void getRootEntries_ReturnsMapOfProperties() {
            String key = "testKey";
            AddPropertyMethod addProperty = () -> null;
            rootEntries.put(key, "value");
            propertyListBuilder = new PropertyListBuilder();
            Assert.assertEquals(rootEntries, propertyListBuilder.getRootEntries());
        }
    }

}