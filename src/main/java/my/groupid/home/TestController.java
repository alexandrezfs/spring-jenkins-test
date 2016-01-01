package my.groupid.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alexandrenguyen on 01/01/16.
 */

@Controller
public class TestController {

    @RequestMapping(value = "/test", method= RequestMethod.GET)
    public String test() {
        return "test/test";
    }
}
