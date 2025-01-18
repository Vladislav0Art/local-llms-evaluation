package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.AnnotatedElement;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildDirectivesForAnnotatedElementTest {

    @Mock
    AnnotatedElement annotatedElement;

    @Mock
    ProcessingElementsContainer processingElementsContainer;

    @Test
    public void buildDirectivesForAnnotatedElementTest() {
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

}