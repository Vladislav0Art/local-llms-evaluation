package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.resource.PropertyReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedCreateTest_NonEmptyList {

    @Test
    public void createTest_NonEmptyList() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new FakeProperty("DataSource.mysql");
        builder.add(property);

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        Assert.assertEquals(1, properties.size());
        Assert.assertEquals(property, properties.get(0));
    }

    public class FakeProperty implements Property<Object> {
        private final String path;

        private FakeProperty(String path) {
            this.path = path;
        }

        @Override
        public Object getDefaultValue() {
            return null;
        }

        @Override
        public String getPath() {
            return this.path;
        }

        @Override
        public Object toExportValue(Object value) {
            return value;
        }

        @Override
        public boolean isValidValue(Object value) {
            return true;
        }

        @Override
        public Object determineValue(PropertyReader reader) {
            return reader.getObject(getPath());
        }
    }

}