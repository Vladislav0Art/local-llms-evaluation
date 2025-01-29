package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddNullProperty {

    @Test
    public void testAddNullProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> list = builder.add(null);
        assertEquals(0, list.size());
    }

}