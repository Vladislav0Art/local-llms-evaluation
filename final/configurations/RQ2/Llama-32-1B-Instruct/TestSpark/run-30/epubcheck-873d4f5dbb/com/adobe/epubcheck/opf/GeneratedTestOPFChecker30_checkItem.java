package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkItem {

    @Test
    public void testOPFChecker30_checkItem() {
        // Given
        String type = "audio/mpeg";
        // When
        checker.checkItem(createItem(type), validationContext);
    }

    private static class CreateItem extends EPFItem {
        @Override
        public Set<String> getRoles() {
            return Collections.emptySet();
        }
    }

}