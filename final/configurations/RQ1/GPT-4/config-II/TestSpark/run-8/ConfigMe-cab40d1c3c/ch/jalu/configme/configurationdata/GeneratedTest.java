package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addSinglePathPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<Integer> property = new TestableProperty<>("sample.property");
        propertyListBuilder.add(property);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        Assert.assertEquals(1, rootEntries.size());
        Assert.assertTrue(rootEntries.containsKey("sample"));
    }

    @Test
    public void addExistsPropertyPathExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<Integer> property = new TestableProperty<>("sample.property");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property); // Exception should occur here
    }

    @Test
    public void createListWithSinglePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<Integer> property = new TestableProperty<>("sample.property");
        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        Assert.assertEquals(1, properties.size());
        Assert.assertEquals(property, properties.get(0));
    }

    class TestableProperty<T> implements Property<T> {
        private String path;

        public TestableProperty(String path) {
            this.path = path;
        }

        @Override
        public String getPath() {
            return this.path;
        }

        @Override
        public T getDefaultValue() {
            return null;
        }

        @Override
        public T toExportValue(T value) {
            return null;
        }

        @Override
        public T fromExportValue(T value) {
            return null;
        }

        @Override
        public T performPreResolveVerification(T value) {
            return null;
        }
    }

}