package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.collection.SportCollection;
import br.com.cwi.tinderevolution.domain.Sport;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoEsporte;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sport")
@Api(value="API REST Sport")
@CrossOrigin(origins = "*")
public class RestSport {

    SportCollection sportCollection = new SportCollection();
    GerenciamentoEsporte gerenciamentoSport = new GerenciamentoEsporte();

    @GetMapping("{id}")
    public Sport findById(@PathVariable("id") Integer id) {


        return this.sportCollection.findById(id);
    }

    @GetMapping
    public List<Sport> findAll() {

        return this.sportCollection.listAll();
    }

    @PutMapping("{id}")
    public Sport update(@PathVariable("id") Integer id, @RequestBody Sport newSport) {

        return sportCollection.update(id, newSport);
    }

    @PostMapping
    public Sport create(@Validated @RequestBody Sport newSport) {

        return this.gerenciamentoSport.save(newSport);

    }
}
