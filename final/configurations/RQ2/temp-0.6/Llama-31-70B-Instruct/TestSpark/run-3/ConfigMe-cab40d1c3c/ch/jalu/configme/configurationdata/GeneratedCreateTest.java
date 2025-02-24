package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.properties.Property;

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertNotNull(propertyListBuilder.create());
    }

}