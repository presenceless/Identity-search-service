package cd.presenceless.Identitysearchservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/search/")
public class IdentitySearchController {

    @PostMapping
    public Object search(@RequestBody Object citizen) {
        return citizen;
    }
}
