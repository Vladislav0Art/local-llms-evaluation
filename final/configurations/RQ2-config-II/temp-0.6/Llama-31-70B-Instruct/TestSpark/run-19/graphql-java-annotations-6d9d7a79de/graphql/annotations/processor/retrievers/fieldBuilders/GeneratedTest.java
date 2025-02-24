package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildTest() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = directivesBuilder.build();
    }

}