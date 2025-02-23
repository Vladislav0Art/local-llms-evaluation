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
public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddWithValidProperty() {
        Property property = new Property("DataSource.mysql");
        propertyListBuilder.add(property);
        Map<String, Object> expectedMap = new HashMap<>();
        expectedMap.put("DataSource", new HashMap<String, Object>());
        assertEquals(expectedMap, propertyListBuilder.getRootEntries());
    }

    @Test
    public void testAddWithDuplicateProperty() {
        Property property = new Property("DataSource.mysql");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void testAddWithPropertyWithInvalidPath() {
        Property property = new Property("DataSource.mysql.security.password");
        propertyListBuilder.add(property);
    }

    @Test
    public void testCreate() {
        Property property = new Property("DataSource.mysql.security.password");
        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

}