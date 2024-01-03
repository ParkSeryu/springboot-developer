package parkseryu.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testSevice;

    @GetMapping("/test")
    public List<Member> test() {
        List<Member> members = testSevice.getAllMembers();
        return members;
    }
}