package kr.co.mip.classification.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class testController {
    @GetMapping("/hello")
    public String Hello() {
        System.out.println("Hello");
        return "Hello";
    }
}
