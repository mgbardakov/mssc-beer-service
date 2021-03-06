package site.hornsandhooves.msscbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.hornsandhooves.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> saveNewBeer(@RequestBody BeerDto beerDto) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Object> updateBeerById(@RequestBody BeerDto beerDto,
                                                 @PathVariable UUID beerId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
