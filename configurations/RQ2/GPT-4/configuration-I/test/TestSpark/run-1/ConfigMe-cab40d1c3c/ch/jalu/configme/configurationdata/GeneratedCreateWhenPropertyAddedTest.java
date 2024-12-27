package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

import org.mockito.Mockito;

public class GeneratedCreateWhenPropertyAddedTest {

    @Test
    public void createWhenPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<String>("TestKey", "DefaultValue") {
            @Override
            protected String getFromExportValue(Object value) {
                return value.toString();
            }

            @Override
            protected Object toExportValue(String value) {
                return value;
            }
        };

        builder.add(property);

        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
    }

}