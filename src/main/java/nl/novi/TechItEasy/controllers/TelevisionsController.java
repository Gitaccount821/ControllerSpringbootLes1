package nl.novi.TechItEasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/television")
public class TelevisionsController {

    // GET request voor alle televisies
    @GetMapping
    public ResponseEntity<String> getAllTelevisions() {

        ResponseEntity.ok("television");
    }

    // GET request voor 1 televisie
    @GetMapping("/{id}")
    public ResponseEntity<String> getTelevisionById(@PathVariable("id") int id) {

        return ResponseEntity.ok("Televisies met waarde " + id);
    }

    // POST request voor 1 televisie
    @PostMapping
    public ResponseEntity<String> addTelevision(@RequestBody String television) {
        // Deze doet niets, is een placeholder gemaakt met ResponseEntiteit die gegeven was
        return ResponseEntity.created(null).body("television");
    }

    // PUT request voor 1 televisie
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable("id") int id, @RequestBody String television) {
        // Ook dit is een placeholder!
        return ResponseEntity.noContent().build();
    }

    // DELETE request voor 1 televisie
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable("id") int id) {
        // Placeholder!
        return ResponseEntity.noContent().build();
    }
}
