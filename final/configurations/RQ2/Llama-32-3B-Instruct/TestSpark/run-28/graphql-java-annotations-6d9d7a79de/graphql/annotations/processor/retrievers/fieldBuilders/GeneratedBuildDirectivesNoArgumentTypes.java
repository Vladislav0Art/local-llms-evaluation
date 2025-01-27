package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedBuildDirectivesNoArgumentTypes {

    @Test
    public void buildDirectivesNoArgumentTypes() {
        GraphQLDirectives directives = new GraphQLDirectives("directives");
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        builder.setAnnotation(directives);
        assertEquals(Arrays.asList(), buildArgumentTypes(directives));
    }

}