package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateNonEmptyList {

    @Test
    public void createNonEmptyList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> list = builder.create();
        assertEquals(2, list.size());
    }

}