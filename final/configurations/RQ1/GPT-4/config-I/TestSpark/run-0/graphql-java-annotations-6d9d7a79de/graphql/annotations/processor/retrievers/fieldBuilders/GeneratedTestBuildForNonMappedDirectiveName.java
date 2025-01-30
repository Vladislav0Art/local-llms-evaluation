package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.typeBuilders.TypeAndWiring;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLFieldDefinition;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildForNonMappedDirectiveName {

    @Test
    public void testBuildForNonMappedDirectiveName() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        builder.build();
    }

}