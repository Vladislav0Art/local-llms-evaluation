package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyToList_MultiplePropertiesAdded Test {

    @Test
    public void addPropertyToList_MultiplePropertiesAdded

    Test() {
        List<Property<?>> list = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        for (int i = 0; i < 5; i++) {
            builder.add(new Object());
        }
        assertEquals(5, list.size());
    }

}