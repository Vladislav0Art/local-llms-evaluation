package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyShouldAddPropertyToList {

    @Test
    public void addPropertyShouldAddPropertyToList() {
        List<MockProperty> list = new ArrayList<>();
        MockProperty property = new MockProperty();
        list.add(property);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        List<MockProperty> result = (List<MockProperty>) builder.create();
        assertThat(result.size(), is(1));
    }

}