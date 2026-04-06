package io.github.modelocontexto.modelocontextoapi.montadora.api;

import io.github.modelocontexto.modelocontextoapi.montadora.CarroStauts;
import io.github.modelocontexto.modelocontextoapi.montadora.Chave;
import io.github.modelocontexto.modelocontextoapi.montadora.HondaHRV;
import io.github.modelocontexto.modelocontextoapi.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Aspirado
    private Motor motor;

    @PostMapping
    public CarroStauts LigarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIngnicao(chave);
    }
}
