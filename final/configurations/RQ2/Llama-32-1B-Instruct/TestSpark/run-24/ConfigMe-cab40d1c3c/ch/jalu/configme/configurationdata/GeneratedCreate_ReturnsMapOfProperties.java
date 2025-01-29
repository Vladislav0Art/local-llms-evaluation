package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedCreate_ReturnsMapOfProperties {

    public static class RootEntries {
        private Map<String, Object> entries = new HashMap<>();

        public void put(String key, Object value) {
            entries.put(key, value);
        }

        @NotNull
        public Map<String, Object> getRootEntries() {
            return entries;
        }
    }

    public static class CreatePropertyListBuilder {
        private RootEntries rootEntries;

        public CreatePropertyListBuilder(RootEntries rootEntries) {
            this.rootEntries = rootEntries;
        }

        @Test
        public void create_ReturnsMapOfProperties() {
            rootEntries.put("key1", "value1");
            rootEntries.put("key2", "value2");

            Assert.assertEquals(2, rootEntries.getRootEntries().size());
            Assert.assertTrue(rootEntries.getRootEntries().get("key1").equals("value1"));
            Assert.assertTrue(rootEntries.getRootEntries().get("key2").equals("value2"));
        }
    }

    public static void main(String[] args) {
        PropertyListBuilder builder = new PropertyListBuilder();
        CreatePropertyListBuilderTest.CreatePropertyListBuilder testBuilder = new CreatePropertyListBuilder(new RootEntries());
        CreatePropertyListBuilderWithAssert testBuilderWithAssert = new CreatePropertyListBuilderWithAssert(testBuilder.getRootEntries());

        System.out.println("Testing create:");
        testBuilder.create();
        testBuilderWithAssert.create();

        PropertyListBuilder.Test testTest = new PropertyListBuilder.Test();
        testTest.put("key1", "value1");
        testTest.put("key2", "value2");

        System.out.println("\nTesting getRootEntries:");
        testBuilder.create();
        System.out.println(testBuilder.getRootEntries());
        testBuilderWithAssert.create();
        System.out.println(testBuilderWithAssert.getRootEntries());
    }

}