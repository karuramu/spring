package com.RESTFULL.WEBSERVICES.HelloWord;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HELLOWORDCONTROLER {
 private final Logger logger=LoggerFactory.getLogger(this.helloWord());

	@GetMapping(path="/helloword")
	public String helloWord() {
		return" Helloword";
	}
@GetMapping(path="/helloword/k")
public HelloWord bean() {
	return new HelloWord("pacitance");
}
@GetMapping(path="/path/{work}")
public HelloWord think(@PathVariable String work) {
	return new HelloWord(String.format("thika,%s",work));
}
}