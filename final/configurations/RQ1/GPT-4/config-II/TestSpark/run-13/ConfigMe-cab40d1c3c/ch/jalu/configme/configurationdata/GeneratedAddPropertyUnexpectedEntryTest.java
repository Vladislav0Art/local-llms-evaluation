package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyUnexpectedEntryTest {

    @Test
    public void addPropertyUnexpectedEntryTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new TestProperty("test"));

        // trigger unexpected entry exception
        builder.add(new TestProperty("test.path"));
    }

}