package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class GeneratedTest {

    @Test
    public void DirectivesBuilderConstructorValidObjectProcessingElementsContainerReturnsInstance() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        assertNotNull(directivesBuilder);
    }

    @Test
    public void constructorValidObjectProcessingElementsContainerReturnsInstance() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        try {
            new DirectivesBuilder(object, container);
        } catch (Exception e) {
            fail("Expected no exception");
        }
    }

    @Test
    public void constructorInvalidReturnsException() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        try {
            new DirectivesBuilder(object, null);
            fail("Expected exception");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

}