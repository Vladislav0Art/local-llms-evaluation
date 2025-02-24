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
public class GeneratedGetRootEntriesTest_WithoutProperties_EmptyMapReturned {

    @Test
    public void getRootEntriesTest_WithoutProperties_EmptyMapReturned() {
        PropertyListBuilder builder = new PropertyListBuilder();

        ArrayList<Property<?>> properties = (ArrayList<Property<?>>) builder.create();
        assertEquals(0, properties.size());
    }

}