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
public class GeneratedTestAddWithPropertyWithInvalidPath {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddWithPropertyWithInvalidPath() {
        Property property = new Property("DataSource.mysql.security.password");
        propertyListBuilder.add(property);
    }

}