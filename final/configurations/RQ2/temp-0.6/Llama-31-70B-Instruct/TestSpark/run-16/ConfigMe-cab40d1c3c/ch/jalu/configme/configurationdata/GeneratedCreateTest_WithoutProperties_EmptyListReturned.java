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
public class GeneratedCreateTest_WithoutProperties_EmptyListReturned {

    @Test
    public void createTest_WithoutProperties_EmptyListReturned() {
        PropertyListBuilder builder = new PropertyListBuilder();

        List<Property<?>> properties = builder.create();
        assertEquals(0, properties.size());
    }

}