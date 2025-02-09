package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddSinglePropertyTest {

    @Test
    public void addSinglePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>("TestKey", "TestValue");
        propertyListBuilder.add(property);

        List<Property<?>> propertyList = propertyListBuilder.create();
        assertEquals(1, propertyList.size());
        assertEquals(property, propertyList.get(0));
    }

}