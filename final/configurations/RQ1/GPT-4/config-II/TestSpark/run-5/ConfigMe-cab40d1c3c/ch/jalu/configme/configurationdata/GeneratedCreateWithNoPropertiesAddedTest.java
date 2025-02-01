package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedCreateWithNoPropertiesAddedTest {

    @Test
    public void createWithNoPropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertTrue(properties.isEmpty());
    }

}