package com.assessment.palindrome;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/palindrome")
@Slf4j
public class PalindromeGenerator {

    @PostMapping
    @RequestMapping("/generate")
    public String generatePalindrome(@RequestParam("sourceString") String source) {

        log.info("Source Input String is {}" , source);
        char[] sourceArray = source.toCharArray();

        int length = sourceArray.length;
        for (int i = 0; i <= ((int) Math.floor((length-1) / 2)); i++) {

            char a = sourceArray[i];
            sourceArray[i] = sourceArray[length - i-1];
            sourceArray[length - i-1] = a;
        }

        source = String.valueOf(sourceArray);

        log.info("Output String is {}" , source);

        return source;
    }


}
