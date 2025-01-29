package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCreate_ReturnsEmptyList {

    @FunctionalInterface
    interface AddPropertyMethod {
        void add(@NotNull Property<?> property) throws ConfigMeException;
    }

    public static class RootEntriesBuilderTest extends PropertyListBuilderTest {

        private Map<String, Object> rootEntries = new HashMap<>();

        @Test
        public void create_ReturnsEmptyList() {
            AddPropertyMethod addProperty = () -> null;
            propertyListBuilder = new PropertyListBuilder();
            Assert.assertTrue(propertyListBuilder.create().isEmpty());
        }
    }

}