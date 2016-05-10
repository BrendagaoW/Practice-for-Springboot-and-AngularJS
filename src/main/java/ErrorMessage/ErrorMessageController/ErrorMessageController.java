package ErrorMessage.ErrorMessageController;

import ErrorMessage.ErrorMessageService.TestService;
import ErrorMessage.Exception.BusinessException;
import ErrorMessage.Exception.ParameterException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@RestController
public class ErrorMessageController {
    @Resource
    private TestService testService;

    @RequestMapping(value = "/controller/{id}", method = RequestMethod.GET)
    public ResponseEntity<Objects> controller(@PathVariable Integer id) throws Exception {
        switch (id) {
            case 1:
                throw new BusinessException("10", "controller10");
            case 2:
                throw new BusinessException("20", "controller20");
            case 3:
                throw new BusinessException("30", "controller30");
            case 4:
                throw new BusinessException("40", "controller40");
            case 5:
                throw new BusinessException("50", "controller50");
            default:
                throw new ParameterException("Controller Parameter Error");
        }
    }

    @RequestMapping(value = "/service/{id}", method = RequestMethod.GET)
    public void service(HttpServletResponse response, @PathVariable Integer id) throws Exception {
        testService.exception(id);
    }

    @RequestMapping(value = "/dao/{id}", method = RequestMethod.GET)
    public void dao(HttpServletResponse response, @PathVariable Integer id) throws Exception {
        testService.dao(id);
    }
}
