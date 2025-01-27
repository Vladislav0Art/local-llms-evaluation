package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedNewDirectivesBuilderCreation {

    @Test
    public void newDirectivesBuilderCreation() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        assertTrue(directivesBuilder instanceof DirectivesBuilder);
    }

}