// package com.example.demo;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// // the `@RestController annotation tells Spring that this code describes an endpoint
// // that should be made available over the web. The @GetMapping("/hello") tells Spring
// // to use our hello() method to answer requests that get sent to the 
// // `http://localhost:8080/hello` address.
// import org.springframework.web.bind.annotation.RestController;


// @SpringBootApplication
// public class DemoApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(DemoApplication.class, args);
// 	}
// 	// the hello method we've added is designed to take a String parameter called name, and
// 	// then combine this parameter with the word "Hello" in the code. This means that if you
// 	// set your name to "Amy" in the request, the response would be "Hello Amy".
// 	@GetMapping("/hello")
// 	public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
// 		// the @RequestParam is telling Spring to expect a name value in the request, but
// 		// if it's not there, it will use the word "World" by default
// 		return String.format("Hello %s!", name);
// 	}

// }

package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
}