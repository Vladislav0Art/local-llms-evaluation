package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void addTest_WithValidProperty_PropertyAdded() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Property<?> property = new Property<>(String.class, "key", "default");
        builder.add(property);

        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertTrue(properties.contains(property));
    }

    @Test
    public void addTest_WithNullProperty_ThrowsException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(null);
    }

    @Test
    public void createTest_WithoutProperties_EmptyListReturned() {
        PropertyListBuilder builder = new PropertyListBuilder();

        List<Property<?>> properties = builder.create();
        assertEquals(0, properties.size());
    }

    @Test
    public void getRootEntriesTest_WithoutProperties_EmptyMapReturned() {
        PropertyListBuilder builder = new PropertyListBuilder();

        ArrayList<Property<?>> properties = (ArrayList<Property<?>>) builder.create();
        assertEquals(0, properties.size());
    }

}