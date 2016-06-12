package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "<html><body>Welcome to the FIRST home page!</body></html>";
    }
    @RequestMapping("/two")
    public String two() {
        return "<html><body>Welcome to the SECOND home page!</body></html>";
    }
    
    @RequestMapping("/logout")
    public String logout() {
        return "<html><body>logged out</body></html>";
    }
}
