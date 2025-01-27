package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNewDirectivesBuilderCreation Test {

    @Test
    public void newDirectivesBuilderCreation

    Test() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        assertTrue(directivesBuilder instanceof DirectivesBuilder);
    }

}