package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

public class GeneratedTest {

    @Test
    public void buildNoAnnotationsTest() {
        try {
            ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
            Class<?> clazz = Class.forName("com.test.NoAnnotations");
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(clazz, mockContainer);
            assertTrue("Should return an empty array when no directives annotations", directivesBuilder.build().length == 0);
        } catch (ClassNotFoundException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }

    @Test
    public void buildWithAnnotationsTest() {
        try {
            ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
            Class<?> clazz = Class.forName("com.test.WithAnnotations");
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(clazz, mockContainer);
            GraphQLDirective[] result = directivesBuilder.build();
            assertTrue("Should return an array of directives", result.length > 0);
            // You may also add assertions for specific directives
        } catch (ClassNotFoundException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }

    @Test
    public void buildWithAnnotationsTest() {
        try {
            ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
            Class<?> clazz = Class.forName("com.test.WithAnnotations");
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(clazz, mockContainer);
            GraphQLDirective[] result = directivesBuilder.build();
            assertTrue("Should return an array of directives", result.length > 0);
        } catch (ClassNotFoundException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }

}