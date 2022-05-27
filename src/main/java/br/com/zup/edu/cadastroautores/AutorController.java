package br.com.zup.edu.cadastroautores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class AutorController {

    private final AutorRepository autorRepository;

    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @PostMapping("/autor")
    ResponseEntity<?> cadastra(@RequestBody @Valid AutorRequest autorRequest, UriComponentsBuilder uriComponentsBuilder){

        Autor autor = autorRequest.toModel();

        autorRepository.save(autor);

        URI location = uriComponentsBuilder.path("/autor/{id}").buildAndExpand(autor.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}


