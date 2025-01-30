package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.field.DirectiveInfo;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.AnnotatedElement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void buildTestWithDirectiveNotFoundException() {
        Method method = Mockito.mock(Method.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, container);

        Mockito.when(container.getDirectiveRegistry()).thenReturn(Collections.emptyMap());

        directivesBuilder.build();
    }

    @Test
    public void buildTestWithDirectiveNotFoundException() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);

        Mockito.when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());

        directivesBuilder.build();
    }

}