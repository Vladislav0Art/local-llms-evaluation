package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyToList_MultiplePropertiesAddedToEmptyList {

    @Test
    public void addPropertyToList_MultiplePropertiesAddedToEmptyList() {
        List<Property<?>> list = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        for (int i = 0; i < 5; i++) {
            builder.add(new Object());
        }
        assertEquals(5, list.size());
    }

}