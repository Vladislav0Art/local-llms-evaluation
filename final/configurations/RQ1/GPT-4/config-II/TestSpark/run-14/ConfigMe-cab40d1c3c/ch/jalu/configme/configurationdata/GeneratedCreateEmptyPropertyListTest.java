package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> list = builder.create();
        assertEquals(0, list.size());
    }

}