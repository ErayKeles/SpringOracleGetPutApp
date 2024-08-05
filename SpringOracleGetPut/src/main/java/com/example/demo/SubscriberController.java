package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam Long subscId,
                            @RequestParam String subscName,
                            @RequestParam String subscSurname,
                            @RequestParam String msisdn,
                            @RequestParam Long tariffId,
                            @RequestParam String startDate) {
        Subscriber subscriber = new Subscriber();
        subscriber.setSubscId(subscId);
        subscriber.setSubscName(subscName);
        subscriber.setSubscSurname(subscSurname);
        subscriber.setMsisdn(msisdn);
        subscriber.setTariffId(tariffId);
        subscriber.setStartDate(java.sql.Date.valueOf(startDate));

        subscriberRepository.save(subscriber);

        return "redirect:/";
    }
}
