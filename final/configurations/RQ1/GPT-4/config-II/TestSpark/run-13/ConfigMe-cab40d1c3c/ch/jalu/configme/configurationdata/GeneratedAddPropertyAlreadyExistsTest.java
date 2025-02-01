package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyAlreadyExistsTest {

    @Test
    public void addPropertyAlreadyExistsTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new TestProperty("test.path");

        builder.add(property);
        builder.add(property);
    }

}