package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateReturnsEmptyListIfNoPropertiesAddedTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void createReturnsEmptyListIfNoPropertiesAddedTest() {
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(0, properties.size());
    }

}