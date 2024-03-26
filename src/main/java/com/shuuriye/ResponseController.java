package com.shuuriye;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ResponseController {
    @GetMapping("/ok")
    public ResponseEntity<String> getok(){
        //200 status code
        return ResponseEntity.ok("Ok message");
    }

    @GetMapping("/notFound")
    public ResponseEntity<String> getnotfound(){
        //404 status code
        //return ResponseEntity.status(HttpStatus.NOT_FOUND ).body("Not found message");
        return new ResponseEntity<> ("Not found message" , HttpStatus.NOT_FOUND );
    }

    @GetMapping("/forbidden")
    public ResponseEntity<String> getforbidden(){
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Forbidden message");
    }

    @GetMapping("/unauthorized")
    public ResponseEntity<String> getunauthrized(){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("unautherized message");
    }

    @GetMapping("/withHeader")
    public ResponseEntity<String> withHeader(){
        HttpHeaders header = new HttpHeaders();
        header.add("custome header", "custom header value");
        return ResponseEntity.status(HttpStatus.OK).headers(header).body("custom header value");
    }

    @GetMapping("/error")
    public ResponseEntity<Map<String , String>> withError(){
        //500 status code
        Map<String , String> errorMap = new HashMap<>();
        errorMap.put("error", "something went wrong!");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMap);
    }

}
