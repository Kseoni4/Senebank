package ru.mirea.senebank.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.mirea.senebank.entity.ClientEntity;
import ru.mirea.senebank.model.ClientModel;
import ru.mirea.senebank.service.ClientService;

@Controller
@Slf4j
@AllArgsConstructor
public class ClientController {

    ClientService clientService;

    @GetMapping("/registration")
    public String reg(){
        return "main";
    }

    @PostMapping("/add")
    public ResponseEntity addNewClient(@RequestBody ClientModel clientModel){
        ClientEntity entity = clientService.addNewClient(clientModel);
        log.info(entity.toString());
        return ResponseEntity.ok(entity.toString());
    }

}
