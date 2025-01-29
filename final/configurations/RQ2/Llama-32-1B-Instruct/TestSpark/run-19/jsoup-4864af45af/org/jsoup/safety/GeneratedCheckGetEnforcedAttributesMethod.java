package org.jsoup.safety;

public class GeneratedCheckGetEnforcedAttributesMethod {

    @Test
    public void checkGetEnforcedAttributesMethod() {
        Safelist list = new Safelist();
        List<String> attributes = new ArrayList<>();
        String[] values = {"value"};
        for (String value : values) {
            Attributes attribute = list.getEnforcedAttributes("enforcer");
            assert !attribute.isEmpty();
            attributes.add(attribute.toString());
        }
        assert attributes.size() == 1;
    }

}