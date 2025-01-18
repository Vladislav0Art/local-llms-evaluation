package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreateEmptyTest {

    @Test
    public void createEmptyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> createdProperties = builder.create();

        assertTrue("Created properties list should be empty.", createdProperties.isEmpty());
    }

}