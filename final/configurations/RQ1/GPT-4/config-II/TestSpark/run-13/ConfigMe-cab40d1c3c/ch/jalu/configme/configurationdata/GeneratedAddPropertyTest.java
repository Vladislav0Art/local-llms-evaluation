package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new TestProperty("test.path");

        builder.add(property);

        // assertions to check if property was added
        assertNotNull(builder.getRootEntries().get("test"));
        assertTrue(builder.getRootEntries().get("test") instanceof Map<?, ?>);
    }

}