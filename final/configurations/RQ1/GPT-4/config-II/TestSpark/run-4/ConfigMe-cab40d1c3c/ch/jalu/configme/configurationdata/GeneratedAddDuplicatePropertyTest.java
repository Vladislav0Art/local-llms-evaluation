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

public class GeneratedAddDuplicatePropertyTest {

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new PropertyStub("test.value");
        propertyListBuilder.add(property);

        try {
            propertyListBuilder.add(property);
            fail("Should have thrown ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Path at 'test.value' already exists", e.getMessage());
        }
    }

}