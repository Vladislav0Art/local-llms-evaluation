package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddWithDuplicateProperty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddWithDuplicateProperty() {
        Property property = new Property("DataSource.mysql");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}