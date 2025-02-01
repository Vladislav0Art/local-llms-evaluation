package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new PropertyStub("test.value");
        propertyListBuilder.add(property);

        List<Property<?>> propertyList = propertyListBuilder.create();

        assertFalse(propertyList.isEmpty());
        assertEquals(1, propertyList.size());
        assertEquals(property, propertyList.get(0));
    }

}