
package Project.Exceptions.Controller;

import Project.Exceptions.Exceptions.BaseException;
import Project.Exceptions.Exceptions.ErrorCode;
import Project.Exceptions.Exceptions.ResourceNotFoundException;
import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/resourceNotFound")
    public void throwException() {
        Person p=new Person(1L,"SnailClimb");
        throw new ResourceNotFoundException(ImmutableMap.of("person id:", p.getId()));
    }

    @GetMapping("/k")
    public void throwException2() {
        Person p=new Person(2L,"Snail");
        throw new BaseException(ErrorCode.REQUEST_VALIDATION_FAILED,ImmutableMap.of("person id:", p.getId()));
    }

}