package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreateEmptyListWhenNoPropertiesAddedTest {

    @Test
    public void createEmptyListWhenNoPropertiesAddedTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.isEmpty());
    }

}