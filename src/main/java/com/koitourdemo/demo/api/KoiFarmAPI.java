package com.koitourdemo.demo.api;

import com.koitourdemo.demo.entity.KoiFarm;
import com.koitourdemo.demo.model.request.KoiFarmRequest;
import com.koitourdemo.demo.model.response.KoiFarmPageResponse;
import com.koitourdemo.demo.service.KoiFarmService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/koiFarm")
@CrossOrigin("*")
@SecurityRequirement(name = "api")
public class KoiFarmAPI {

    @Autowired
    KoiFarmService koiFarmService;

    @PostMapping("/create")
    public ResponseEntity createKoiFarm(@Valid @RequestBody KoiFarmRequest koiFarm){
        KoiFarm newKoiFarm = koiFarmService.createNewKoiFarm(koiFarm);
        return ResponseEntity.ok(newKoiFarm);
    }

    @GetMapping("/get-all")
    public ResponseEntity getAllKoiFarm(@RequestParam int page, @RequestParam(defaultValue = "5") int size){
        KoiFarmPageResponse koiFarmResponse = koiFarmService.getAllKoiFarm(page, size);
        return ResponseEntity.ok(koiFarmResponse);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity updateKoi(@Valid @RequestBody KoiFarm koiFarm, @PathVariable long id){
        KoiFarm updated = koiFarmService.updateKoiFarm(koiFarm, id);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity deleteKoiFarm(@PathVariable long id){
        KoiFarm deleted = koiFarmService.deleteKoiFarm(id);
        return ResponseEntity.ok(deleted);
    }

}
