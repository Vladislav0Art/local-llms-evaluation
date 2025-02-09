package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
    }

}